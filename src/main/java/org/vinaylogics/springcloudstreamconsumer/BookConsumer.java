package org.vinaylogics.springcloudstreamconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class BookConsumer {

    @Bean
    Consumer<Message<Book>> receiveBook() {
        return this::listenMessage;
    }

    private void listenMessage(Message<Book> message) {
        log.info("Message received: {}", message.getPayload());
    }
}
