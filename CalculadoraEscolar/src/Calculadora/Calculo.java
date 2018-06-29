
package Calculadora;


public class Calculo {

    //Niveles de Expresión
    static int nivelSuma,nivelResta,nivelDiv,nivelMulti;

    public static void setNivelSuma(int nivelSuma) {
        Calculo.nivelSuma = nivelSuma;
    }

    public static void setNivelResta(int nivelResta) {
        Calculo.nivelResta = nivelResta;
    }

    public static void setNivelDiv(int nivelDiv) {
        Calculo.nivelDiv = nivelDiv;
    }

    public static void setNivelMulti(int nivelMulti) {
        Calculo.nivelMulti = nivelMulti;
    }

    
    //Operaciones
      public static int Suma (int a, int b){
        return a+b;
    }
            
    public static int Resta (int a, int b){
        return a-b;
    }
    
    public static int Division (int a, int b){
        return a/b;
    }
        
    public static int Multiplicación (int a, int b){
        return a*b;
    }
    
    public static int Distributiva_suma (int a,int b,int c){
        return (a*b+a*c);
    }
    
    public static int Asociativa_div (int a,int b,int c){
        int resultado= a/(b+c);
        return resultado;
    }
    
    public Calculo() {
    }
        
}
