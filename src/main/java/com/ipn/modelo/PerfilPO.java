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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "c_perfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilPO.findAll", query = "SELECT p FROM PerfilPO p")})
public class PerfilPO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_perfil")
    private String idPerfil;
    @Column(name = "descripcion")
    private String descripcion;
    @JoinTable(name = "d_perfil_rol", joinColumns = {
        @JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")}, inverseJoinColumns = {
        @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<RolPO> rolPOList;
    @ManyToMany(mappedBy = "perfilPOList", fetch = FetchType.LAZY)
    private List<UsuarioPO> usuarioPOList;

    public PerfilPO() {
    }

    public PerfilPO(String idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(String idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<RolPO> getRolPOList() {
        return rolPOList;
    }

    public void setRolPOList(List<RolPO> rolPOList) {
        this.rolPOList = rolPOList;
    }

    @XmlTransient
    public List<UsuarioPO> getUsuarioPOList() {
        return usuarioPOList;
    }

    public void setUsuarioPOList(List<UsuarioPO> usuarioPOList) {
        this.usuarioPOList = usuarioPOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfil != null ? idPerfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilPO)) {
            return false;
        }
        PerfilPO other = (PerfilPO) object;
        if ((this.idPerfil == null && other.idPerfil != null) || (this.idPerfil != null && !this.idPerfil.equals(other.idPerfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ipn.modelo.PerfilPO[ idPerfil=" + idPerfil + " ]";
    }
    
}
