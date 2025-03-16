package org.badis.presentation;

import org.badis.dao.DaoImpl;
import org.badis.metier.MetierImpl;

public class Presentation1 {

    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl m = new MetierImpl(d);
        System.out.println("RES = " + m.calcul());
    }
}
