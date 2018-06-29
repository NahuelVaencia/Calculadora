
package Pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Calculadora.*;

public class UnitTest {
    
    public UnitTest() {
    }
    
    //Probando funcionamiento del metodo suma
    @Test
    public void testSuma(){
    int resultado = Calculo.Suma(3, 2);
    int esperado = 5; 
    assertEquals("Fallo Calculo.Suma",esperado, resultado);       
    }
    
    //Probando propiedad conmutativa de suma
    @Test
    public void testConmutacionSuma(){
        int resul1 = Calculo.Suma(10, 5);
        int resul2 = Calculo.Suma(5, 10);
        
        assertEquals("Fallo Calculo.Suma", resul1, resul2);
        
    }
    
    //Probando cuando el usuario se registra que la logitud de la contraseña sea mayor a 8
    @Test
    public void testLongContraseña(){
        String a="nahuel";
        String b="sasfasdsffh";
        boolean esperado;
        boolean resultado = Usuario.Registrar(a, b);
        
        if (b.length()<8){
             esperado = false; 
        }
        else{ 
             esperado = true;
        }
        
        assertEquals("Fallo Usuario.Registrar",resultado, esperado);
    }
}
