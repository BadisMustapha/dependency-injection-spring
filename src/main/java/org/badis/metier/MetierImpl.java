package org.badis.metier;

import org.badis.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("d2")
    private IDao dao; // Couplage faible

    public MetierImpl() {
    }

    /**
     * Pour Injecter dans l'attribut dao
     * un objet de type IDao
     * au moment de l'instanciation
     */

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData(); // Couplage faible
        double res = t*12*Math.PI/2*Math.cos(t);
        return res;
    }

    /**
     * Pour injecter dans l'attribut dao
     * un objet de type IDao
     * après l'instanciation
     */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
