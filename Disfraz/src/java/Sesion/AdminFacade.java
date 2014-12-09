/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion;

import Entidad.Admin;
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
public class AdminFacade extends AbstractFacade<Admin> {
    @PersistenceContext(unitName = "DisfrazPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdminFacade() {
        super(Admin.class);
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
    
    public List<Admin> buscaUsuario(String user) {
        Query result = em.createNamedQuery("Admin.findByUsuario");
	result.setParameter("usuario",user);
	return result.getResultList();
    }
    
}
