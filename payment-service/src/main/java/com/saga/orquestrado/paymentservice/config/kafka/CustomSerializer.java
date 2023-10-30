package com.saga.orquestrado.paymentservice.config.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.saga.orquestrado.paymentservice.adapter.output.message.SaleMessage;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

public class CustomSerializer implements Serializer<SaleMessage> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte[] serialize(String s, SaleMessage saleMessage) {
        try{
            if (saleMessage == null) return null;
            return objectMapper.writeValueAsBytes(saleMessage);
        }catch (Exception exception){
            throw new SerializationException("Erro ao serializar SaleMessage para byte[]");
        }
    }
}
