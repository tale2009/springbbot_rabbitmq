package com.kendo.rabbitmq;
import com.BaseApplication;
import com.kendo.rabbitmq.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Stephanie on 2017/9/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class RabbitmqTest {
    @Autowired
    private Sender sender;

    @Test
    public void helloTest()
    {
        sender.send();
    }
}
