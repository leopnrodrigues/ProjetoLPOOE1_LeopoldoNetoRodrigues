/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import br.edu.ifsul.passofundo.projetolpooe1_leopoldonetorodrigues.dao.PersistenciaJPA;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20231PF.CC0030
 */
public class TestePersistencia {
    
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    
    
    public TestePersistencia() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testePersistencia() {
//        
//        try{
//            jpa.persist(m);
//            jpa.persist(v);
//            jpa.persist(p);
//        } catch(Exception e) {
//            System.err.println("Erro ao persistir modelo: "+m);
//        }
    }
}
