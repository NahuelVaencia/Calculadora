


package Calculadora;


public class Usuario {

    public Usuario() {
    }
    


//Registrar Usuario
public static boolean Registrar(String user, String pass){
    int cadena = pass.length();
    if (cadena >= 8){
        System.out.println("Contraseña Correcta");
    return true;
    }
    else {
        System.out.println("Error en la constraseña");
    return false;            
    }   
}
   


//Ingresar a la calculadora
public static boolean Ingresar(String user, String pass,String cargo, int nivel){
        
        boolean ingreso=false;
         
        if (cargo.equals("Profesor") || nivel>=8){
            ingreso=true;         
            System.out.println("Bienvenido a la Calculadora, "+user+".");
            return ingreso;
        }else {
            System.out.println("Tocá de acá, "+user+".");
            return ingreso;
        }
        
} 

//Asignar nivel a una Expresion
public static void AsignaNivelExp(String cargo, String expresion, int nivelExp){
    if (cargo.equals("profesor")){
        
        switch(expresion){
            case "suma":
                Calculo.setNivelSuma(nivelExp);
                break;
                case "resta":
                Calculo.setNivelResta(nivelExp);
                break;
                case "division":
                Calculo.setNivelDiv(nivelExp);
                break;
                case "multiplicacion":
                Calculo.setNivelMulti(nivelExp);
                break;                 
        }
        
        
    }
}

//Asignar nivel a una Expresion
public static void ConsultaNivelAlumno(String cargo, String expresion, int nivelExp){
    if (cargo.equals("profesor")){
        
        switch(expresion){
            case "suma":
                Calculo.setNivelSuma(nivelExp);
                break;
                case "resta":
                Calculo.setNivelResta(nivelExp);
                break;
                case "division":
                Calculo.setNivelDiv(nivelExp);
                break;
                case "multiplicacion":
                Calculo.setNivelMulti(nivelExp);
                break;                 
        }
        
        
    }
}





}
