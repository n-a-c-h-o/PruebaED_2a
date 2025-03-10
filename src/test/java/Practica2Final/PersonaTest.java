/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Practica2Final;

import instituto.Nif;
import instituto.Persona;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vespertino
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test del metodo getNif, de la clase Persona.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Persona instance = new Persona();
        Nif expResult = null;
        Nif result = instance.getNif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo setNif, de la clase Persona.
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        Nif nif = null;
        Persona instance = new Persona();
        instance.setNif(nif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo getNombre, de la clase Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testSetNombre, de la clase Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testGetGenero, de la clase Persona.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Persona instance = new Persona();
        char expResult = ' ';
        char result = instance.getGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testSetGenero, de la clase Persona.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        char genero = ' ';
        Persona instance = new Persona();
        instance.setGenero(genero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testGetNacimiento, de la clase Persona.
     */
    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        Persona instance = new Persona();
        LocalDate expResult = null;
        LocalDate result = instance.getNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testSetNacimiento, de la clase Persona.
     */
    @Test
    public void testSetNacimiento() {
        System.out.println("setNacimiento");
        LocalDate nacimiento = null;
        Persona instance = new Persona();
        instance.setNacimiento(nacimiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testGetEdad, de la clase Persona.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testToString, de la clase Persona.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testEquals_Persona, de la clase Persona.
     */
    @Test
    public void testEquals_Persona() {
        System.out.println("equals");
        Persona a = null;
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testEquals_Object, de la clase Persona.
     */
    @Test
    public void testEquals_Object() {
        System.out.println("equals");
        Object obj = null;
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del metodo testCompareTo, de la clase Persona.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Persona o = null;
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
