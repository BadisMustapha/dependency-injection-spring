package org.badis.presentation;

import org.badis.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.badis");

        IMetier metier = applicationContext.getBean(IMetier.class);

        System.out.println("RES = "+ metier.calcul());


    }
}
