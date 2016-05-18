/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dml
 */
@Entity
@Table(name = "c_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolPO.findAll", query = "SELECT r FROM RolPO r")})
public class RolPO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_rol")
    private String idRol;
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToMany(mappedBy = "rolPOList", fetch = FetchType.LAZY)
    private List<PerfilPO> perfilPOList;

    public RolPO() {
    }

    public RolPO(String idRol) {
        this.idRol = idRol;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<PerfilPO> getPerfilPOList() {
        return perfilPOList;
    }

    public void setPerfilPOList(List<PerfilPO> perfilPOList) {
        this.perfilPOList = perfilPOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolPO)) {
            return false;
        }
        RolPO other = (RolPO) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ipn.modelo.RolPO[ idRol=" + idRol + " ]";
    }
    
}
