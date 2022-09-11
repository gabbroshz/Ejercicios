package Periodo2Semana5;
import java.util.Scanner;
public class Periodo2Clase13 {
    public static void main(String[] args){
        String tipoDia = "";
        String diaSemana = "";
        
        switch (diaSemana.toLowerCase()){
            case "lunes" -> tipoDia = "Inicio de semana";
            case "martes", "miercoles", "jueves" -> tipoDia = "Mediados de semana";
            case "viernes" -> tipoDia = "Inicio de fin de semana";
            case "sabado", "domingo" -> tipoDia = "Fin de semana";
                
            
        }
        System.out.println(diaSemana + "es" + tipoDia);
    }
}
