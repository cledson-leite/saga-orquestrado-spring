package com.saga.orquestrado.paymentservice.application.core.usecase;

import com.saga.orquestrado.paymentservice.application.core.domain.Payment;
import com.saga.orquestrado.paymentservice.application.core.domain.Sale;
import com.saga.orquestrado.paymentservice.application.core.domain.User;
import com.saga.orquestrado.paymentservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrado.paymentservice.application.ports.input.FindUserByIdInput;
import com.saga.orquestrado.paymentservice.application.ports.input.SalePaymentInput;
import com.saga.orquestrado.paymentservice.application.ports.output.SavePaymentOutput;
import com.saga.orquestrado.paymentservice.application.ports.output.SendToKafkaOutput;
import com.saga.orquestrado.paymentservice.application.ports.output.UpdateUserOutput;

public class SalePaymentUseCase implements SalePaymentInput {
    private final FindUserByIdInput findUserByIdInput;
    private final UpdateUserOutput updateUserOutput;
    private final SavePaymentOutput savePaymentOutput;
    private final SendToKafkaOutput sendToKafkaOutput;

    public SalePaymentUseCase(
            FindUserByIdInput findUserByIdInput,
            UpdateUserOutput updateUserOutput,
            SavePaymentOutput savePaymentOutput,
            SendToKafkaOutput sendToKafkaOutput
    ) {
        this.findUserByIdInput = findUserByIdInput;
        this.updateUserOutput = updateUserOutput;
        this.savePaymentOutput = savePaymentOutput;
        this.sendToKafkaOutput = sendToKafkaOutput;
    }

    @Override
    public void payment(Sale sale) {
        try {
            User user = findUserByIdInput.find(sale.getUserId());
            if (user.getBalance().compareTo(sale.getValue()) < 0) {
                throw new RuntimeException("Saldo insuficiente!");
            }
            user.debitBalance(sale.getValue());
            updateUserOutput.update(user);
            Payment newPayment = new Payment(null, sale.getUserId(), sale.getId(), sale.getValue());
            savePaymentOutput.save(newPayment);
            sendToKafkaOutput.send(sale, SaleEvent.PAYMENT_EXECUTED);
        } catch (
                Exception exception) {
            sendToKafkaOutput.send(sale, SaleEvent.PAYMENT_FAILED);
        }
    }
}
