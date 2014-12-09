/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Bere Cuellar
 */
@Entity
@Table(name = "disfraz")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disfraz.findAll", query = "SELECT d FROM Disfraz d"),
    @NamedQuery(name = "Disfraz.findById", query = "SELECT d FROM Disfraz d WHERE d.id = :id"),
    @NamedQuery(name = "Disfraz.findByNombre", query = "SELECT d FROM Disfraz d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Disfraz.findByTalla", query = "SELECT d FROM Disfraz d WHERE d.talla = :talla"),
    @NamedQuery(name = "Disfraz.findByDescripcion", query = "SELECT d FROM Disfraz d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "Disfraz.findByPrecio", query = "SELECT d FROM Disfraz d WHERE d.precio = :precio"),
    @NamedQuery(name = "Disfraz.findByExistencia", query = "SELECT d FROM Disfraz d WHERE d.existencia = :existencia")})
public class Disfraz implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "talla")
    private String talla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private BigDecimal precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "existencia")
    private int existencia;
    @JoinTable(name = "pedido_has_disfraz", joinColumns = {
        @JoinColumn(name = "disfraz_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "pedido_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Pedido> pedidoCollection;
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Categoria categoriaId;

    public Disfraz() {
    }

    public Disfraz(Integer id) {
        this.id = id;
    }

    public Disfraz(Integer id, String nombre, String talla, String descripcion, BigDecimal precio, int existencia) {
        this.id = id;
        this.nombre = nombre;
        this.talla = talla;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    public Categoria getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Categoria categoriaId) {
        this.categoriaId = categoriaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disfraz)) {
            return false;
        }
        Disfraz other = (Disfraz) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Disfraz[ id=" + id + " ]";
    }
    
}
