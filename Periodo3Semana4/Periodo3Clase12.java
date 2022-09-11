package Periodo3Semana4;
import java.util.Scanner;
public class Periodo3Clase12 {
    public static void main(String[] argas){
        int suma = 0, cant = 0, valor, promedio;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Ingresar 0 para salir");
            System.out.println("Ingresar el valor");
            valor = entrada.nextInt();
            if (valor !=0){
                suma = suma + valor;
                cant = cant + 1;
            }      
    } while (valor != 0);
        if (cant != 0){
           promedio = suma / cant;
           System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron valores");
        }
    }
}
