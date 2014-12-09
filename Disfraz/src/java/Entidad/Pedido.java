/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Bere Cuellar
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id"),
    @NamedQuery(name = "Pedido.findByCantidad", query = "SELECT p FROM Pedido p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Pedido.findByTotal", query = "SELECT p FROM Pedido p WHERE p.total = :total"),
    @NamedQuery(name = "Pedido.findByFechaentrega", query = "SELECT p FROM Pedido p WHERE p.fechaentrega = :fechaentrega"),
    @NamedQuery(name = "Pedido.findByNumeroconfirma", query = "SELECT p FROM Pedido p WHERE p.numeroconfirma = :numeroconfirma"),
    @NamedQuery(name = "Pedido.findByStatus", query = "SELECT p FROM Pedido p WHERE p.status = :status")})
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "fechaentrega")
    @Temporal(TemporalType.DATE)
    private Date fechaentrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroconfirma")
    private int numeroconfirma;
    @Size(max = 45)
    @Column(name = "status")
    private String status;
    @ManyToMany(mappedBy = "pedidoCollection")
    private Collection<Disfraz> disfrazCollection;
    @JoinColumn(name = "cliente_mail", referencedColumnName = "mail")
    @ManyToOne(optional = false)
    private Cliente clienteMail;

    public Pedido() {
    }

    public Pedido(Integer id) {
        this.id = id;
    }

    public Pedido(Integer id, int cantidad, BigDecimal total, int numeroconfirma) {
        this.id = id;
        this.cantidad = cantidad;
        this.total = total;
        this.numeroconfirma = numeroconfirma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public int getNumeroconfirma() {
        return numeroconfirma;
    }

    public void setNumeroconfirma(int numeroconfirma) {
        this.numeroconfirma = numeroconfirma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<Disfraz> getDisfrazCollection() {
        return disfrazCollection;
    }

    public void setDisfrazCollection(Collection<Disfraz> disfrazCollection) {
        this.disfrazCollection = disfrazCollection;
    }

    public Cliente getClienteMail() {
        return clienteMail;
    }

    public void setClienteMail(Cliente clienteMail) {
        this.clienteMail = clienteMail;
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
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Pedido[ id=" + id + " ]";
    }
    
}
