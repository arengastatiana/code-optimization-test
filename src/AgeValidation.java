
import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Abro el escanner para preguntar la edad

        System.out.println("ingrese la edad del usuario"); // esta preguntando la edad del usuario
        int edadUsuario = scanner.nextInt();


        final int AGE_LIMIT = 18; // modifico los numeros magicos de constantes
        
        if (edadUsuario >= AGE_LIMIT ) { // la edad que entra por la  consola si o si tiene que cumplir el condicional para que corra 
            System.out.println("Access granted"); // si edadUsuario es igual o mayor a 18 imprime, este mensaje
        }
        
        else { System.out.println("Access danied");} // si edadUsuarioes menor a 18, imprime este mensaje
        }
    }


