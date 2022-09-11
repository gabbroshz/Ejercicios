package Periodo2Semana7;
import javax.swing.JOptionPane;
public class Periodo2Clase20 {
    public static void main(String[] args){
        String menu = new String("Elija una opción: 1, 2, 3 o 4 \n");
        for (int i = 1; i<= 4; i++){
            menu = menu + "opcion" +i + "\n";
        }
        String option = JOptionPane.showInputDialog(menu.toString());
        switch (option){
            case "1":
                JOptionPane.showMessageDialog(null, "Felicitaciones, ha escogido la opcion 1");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Felicitaciones, ha escogido la opcion 2");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Felicitaciones, ha escogido la opcion 1");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Felicitaciones, ha escogido la opcion 1");
                break;
            default:
                JOptionPane.showMessageDialog(null,option + "No es una opcion valida");
        }
    }
}
