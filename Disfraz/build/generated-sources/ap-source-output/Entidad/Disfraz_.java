package Entidad;

import Entidad.Categoria;
import Entidad.Pedido;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-08T23:50:37")
@StaticMetamodel(Disfraz.class)
public class Disfraz_ { 

    public static volatile SingularAttribute<Disfraz, String> descripcion;
    public static volatile SingularAttribute<Disfraz, Integer> existencia;
    public static volatile SingularAttribute<Disfraz, BigDecimal> precio;
    public static volatile SingularAttribute<Disfraz, String> talla;
    public static volatile SingularAttribute<Disfraz, Integer> id;
    public static volatile CollectionAttribute<Disfraz, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Disfraz, String> nombre;
    public static volatile SingularAttribute<Disfraz, Categoria> categoriaId;

}