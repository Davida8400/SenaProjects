/* Esta app es desarrollada por:
-Jhohan Pedraza
*/
import javax.swing.JOptionPane;
public class App {

    public void Impresion(){
        String names, addres, phone_n, email, genre, city, age, bag_weight;
        names = JOptionPane.showInputDialog("Ingrese sus nombres y apellidos");
        addres = JOptionPane.showInputDialog("Ingrese la dirección de su residencia");
        phone_n = JOptionPane.showInputDialog("Ingrese su número de teléfono");
        email = JOptionPane.showInputDialog("Ingrese su dirección de correo electrónico");
        age = JOptionPane.showInputDialog("Ingrese su edad");
        city = JOptionPane.showInputDialog("Ingrese su ciudad de nacimiento");
        genre = JOptionPane.showInputDialog("Ingrese su género");
        //JOptionPane.showMessageDialog(null, "Usted es de: " + city);
        JOptionPane.showMessageDialog(null,
        "1. Bogotá-Cali\n" + "2. Bogotá-Medellín\n" +"3. Bogotá-Manizales\n" +
        "4. Bogotá-Barranquilla\n" + "5. Cali-Bogotá\n" + "6. Medellín-Bogotá" +
        "7. Manizales-Bogotá" + "8. Barranquilla-Bogotá");
    }
    public static void main(String[] args) throws Exception {
        App haga=new App();
        haga.Impresion();
    }
}