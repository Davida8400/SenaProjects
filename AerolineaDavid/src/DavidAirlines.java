import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class DavidAirlines extends JFrame implements ActionListener{
    JLabel jlNombres, jlApellidos, jlDireccion, jlTelefono,
     jlCorreo, jlEdad, jlPesoEquipaje, jlPesoExcedido, jlGenero;
    JTextField tfNombres, tfApellidos, tfDireccion, tfTelefono,
     tfCorreo, tfEdad, tfPesoEquipaje, tfPesoExcedido, tfGenero;

    public DavidAirlines(){
        setLayout(null);
        
    }
    public void actionPerformed(ActionEvent Oyente){
        }
    public static void main(String[] args) {
        DavidAirlines formulario = new DavidAirlines();
        formulario.setBounds(20, 20, 700, 700);
        formulario.setTitle("Aerolinea Avianca");
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
