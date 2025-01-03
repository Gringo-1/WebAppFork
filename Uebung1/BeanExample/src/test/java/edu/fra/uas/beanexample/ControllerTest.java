package edu.fra.uas.beanexample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private BeanController beanController;
    private MessageService messageService;

    @Test
    void testController() {
        assertThat(beanController.putMessage("Das ist ein Test"))
        .isEqualTo("Das ist ein Test");
    }

    public void testIncrement() {
        Integer initialCounter = messageService.getCounter();

        messageService.increment();

        assertThat(messageService.getCounter()).isEqualTo(initialCounter + 1);
    }
}
