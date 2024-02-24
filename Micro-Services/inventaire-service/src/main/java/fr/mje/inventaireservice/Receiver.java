package fr.mje.inventaireservice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(queues = "egg-eclosion")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

}
