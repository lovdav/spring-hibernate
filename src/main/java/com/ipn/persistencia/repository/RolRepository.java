/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.persistencia.repository;

import com.ipn.modelo.RolPO;
import java.util.List;

/**
 *
 * @author dml
 */
public interface RolRepository {
    
    public List<RolPO> getRoles();
    
    public void addRol(RolPO poRol);
    
}
