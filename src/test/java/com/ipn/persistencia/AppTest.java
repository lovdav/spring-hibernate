package com.ipn.persistencia;

import com.ipn.modelo.RolPO;
import com.ipn.persistencia.repository.RolRepository;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import static org.junit.Assert.assertNotNull;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class AppTest 
{
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Autowired
    private RolRepository repository;
    
    @org.junit.Test
    public void testUpdate(){
        repository.addRol(new RolPO());
        assertNotNull("Termino");
        System.out.println("Termino");
    }
    
    @org.junit.Test
    public void testRoles(){
        List<RolPO> roles = repository.getRoles();
        assertNotNull(roles);
        
        System.out.println("Termino Roles " + roles.size());
    }
}
