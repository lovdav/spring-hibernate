/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.persistencia.repository.impl;

import com.ipn.modelo.RolPO;
import com.ipn.persistencia.repository.RolRepository;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dml
 */
@Repository
public class RolRepositoryImpl implements RolRepository{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<RolPO> getRoles() {
        List<RolPO> roles = null;
        Session session = this.currentSession();
        session.beginTransaction();
        roles = session.createCriteria(RolPO.class).list();
        return roles;
    }
    
    public void addRol(RolPO poRol) {
        Session session = this.currentSession();
        session.beginTransaction();
        session.createQuery("update RolPO set descripcion = 'de'").executeUpdate();
        session.getTransaction().commit();
    }
    
}
