package br.faccat.sistdist.springbootrestapi;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    private final RabbitTemplate rabbitTemplate;

    public MessageProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessageToQueue1(String message) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.DIRECT_EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY_1, message);
        System.out.println("Mensagem enviada para a Fila 1: " + message);
    }

    public void sendMessageToQueue2(String message) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.DIRECT_EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY_2, message);
        System.out.println("Mensagem enviada para a Fila 2: " + message);
    }
}
