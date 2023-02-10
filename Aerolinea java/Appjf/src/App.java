import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {

        String edad;
        int edad_int;
        edad = JOptionPane.showInputDialog("Ingrese su edad");
        edad_int = Integer.parseInt(edad);
        if (edad > 0){
            if (edad>=18){
            JOptionPane.showMessageDialog(null, "null");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "null");
        }
    }
}
