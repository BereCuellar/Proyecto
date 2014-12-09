/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion;

import Entidad.Disfraz;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bere Cuellar
 */
@Stateless
public class DisfrazFacade extends AbstractFacade<Disfraz> {
    @PersistenceContext(unitName = "DisfrazPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DisfrazFacade() {
        super(Disfraz.class);
    }
    
}
