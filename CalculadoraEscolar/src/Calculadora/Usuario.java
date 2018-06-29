


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
public static void Ingresar (String user, String pass,String cargo){
            
                System.out.println("Bienvenido a la Calculadora");   
                }

//Asignar nivel a una Expresion
public static void AsignaNivel(String cargo, String expresion, int nivel){
    if (cargo.equals("profesor")){
        
        switch(expresion){
            case "suma":
                Calculo.setNivelSuma(nivel);
                break;
                case "resta":
                Calculo.setNivelResta(nivel);
                break;
                case "division":
                Calculo.setNivelDiv(nivel);
                break;
                case "multiplicacion":
                Calculo.setNivelMulti(nivel);
                break;                 
        }
        
    }
}
}
