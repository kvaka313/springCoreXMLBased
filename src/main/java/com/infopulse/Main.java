package com.infopulse;

import com.infopulse.beans.First;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        First first = context.getBean("entityA", First.class);
        System.out.println(first.getSeconds().get(1).getA());
    }
}
