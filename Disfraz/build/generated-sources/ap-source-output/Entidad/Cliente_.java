package Entidad;

import Entidad.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-08T23:50:37")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellidos;
    public static volatile SingularAttribute<Cliente, String> password;
    public static volatile SingularAttribute<Cliente, String> mail;
    public static volatile SingularAttribute<Cliente, String> tarjetanumero;
    public static volatile SingularAttribute<Cliente, String> municipio;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile CollectionAttribute<Cliente, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> nombre;

}