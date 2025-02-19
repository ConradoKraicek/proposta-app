package com.conrado.proposta_app.service;

import com.conrado.proposta_app.dto.PropostaResponseDto;
import com.conrado.proposta_app.entity.Proposta;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class NotificacaoService {

    private RabbitTemplate rabbitTemplate;

    public void notificar(Proposta proposta, String exchange) {
        rabbitTemplate.convertAndSend(exchange, "", proposta);
    }
}
