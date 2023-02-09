/* Esta app es desarrollada por:
-Jhohan Pedraza
*/
import javax.swing.JOptionPane;
public class App {
    
    public void Impresion(){
        String Ciudad;
        Ciudad = JOptionPane.showInputDialog("Ingrese su ciudad de nacimiento");
        JOptionPane.showMessageDialog(null, "Usted es de: " + Ciudad);
    }
    public static void main(String[] args) throws Exception {
        App haga=new App();
        haga.Impresion();
    }
}