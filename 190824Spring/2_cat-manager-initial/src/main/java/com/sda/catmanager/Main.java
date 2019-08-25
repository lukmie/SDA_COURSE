package com.sda.catmanager;

import com.sda.catmanager.house.House;
import com.sda.catmanager.model.Cat;
import com.sda.catmanager.service.CatManager;
import com.sda.catmanager.service.helper.CatFeeder;
import com.sda.catmanager.service.helper.CatWasher;
import com.sda.catmanager.service.helper.KitchenService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@ComponentScan
public class Main {

    public static void main(String[] args) {
//        KitchenService kitchenService = new KitchenService();
//        CatFeeder catFeeder = new CatFeeder(kitchenService);
//        CatWasher catWasher = new CatWasher();
//
//        CatManager manager = new CatManager(catWasher, catFeeder);
//
//        Cat rys = new Cat("Rys", 11);
//
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        CatManager manager = applicationContext.getBean(CatManager.class);
//        Cat rys = applicationContext.getBean(Cat.class);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
//        CatManager manager = applicationContext.getBean(CatManager.class);
//        Cat rys = new Cat("Rys", 11);
//        manager.washCat(rys);
//        manager.feedCat(rys, 78);
//        manager.feedCat(rys, 15);
//        manager.feedCat(rys, 0);
//        manager.feedCat(rys, 1);

        House house = applicationContext.getBean(House.class);
        house.bringMedia();

    }
}
