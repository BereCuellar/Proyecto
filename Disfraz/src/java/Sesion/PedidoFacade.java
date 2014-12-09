/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion;

import Entidad.Pedido;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Bere Cuellar
 */
@Stateless
public class PedidoFacade extends AbstractFacade<Pedido> {
    @PersistenceContext(unitName = "DisfrazPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PedidoFacade() {
        super(Pedido.class);
    }
    
    public List<Pedido> buscaPedido(Integer id) {
        Query result = em.createNamedQuery("Pedido.findById");
	result.setParameter("id",id);
	return result.getResultList();
    }
    
    public List<Pedido> buscaPedidosByStatus(String status) {
        Query result = em.createNamedQuery("Pedido.findByStatus");
        result.setParameter("status",status);
	return result.getResultList();
    }
    
}
