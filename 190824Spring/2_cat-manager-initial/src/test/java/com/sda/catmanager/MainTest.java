package com.sda.catmanager;

import com.sda.catmanager.Main;
import com.sda.catmanager.service.CatManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Java6Assertions.assertThat;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Main.class)
public class MainTest implements ApplicationContextAware {

    private ApplicationContext context;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Test
    public void run(){

        CatManager catManager = context.getBean(CatManager.class);
        assertThat(catManager).isNotNull();

        //Assert.assertEquals(context, "sd");
    }
}
