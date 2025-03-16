package org.badis.presentation;

import org.badis.dao.IDao;
import org.badis.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException,
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance(); // Instantiation dynamique
        //System.out.println("RES = " + dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao); // Instantiation dynamique
        System.out.println("RES = " + metier.calcul());
        scanner.close();
    }
}
