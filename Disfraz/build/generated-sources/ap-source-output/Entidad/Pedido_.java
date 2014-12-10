package Entidad;

import Entidad.Cliente;
import Entidad.Disfraz;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T04:45:23")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Date> fechaentrega;
    public static volatile SingularAttribute<Pedido, BigDecimal> total;
    public static volatile SingularAttribute<Pedido, Integer> numeroconfirma;
    public static volatile SingularAttribute<Pedido, Cliente> clienteMail;
    public static volatile CollectionAttribute<Pedido, Disfraz> disfrazCollection;
    public static volatile SingularAttribute<Pedido, Integer> id;
    public static volatile SingularAttribute<Pedido, Integer> cantidad;
    public static volatile SingularAttribute<Pedido, String> status;

}