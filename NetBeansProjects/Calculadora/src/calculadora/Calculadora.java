package calculadora;

/*
 * @author David
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
    //Definición de etiquetas
    JLabel jlNumber1, jlNumber2;
    JTextField tfNumber1, tfNumber2;
    JButton btnLimpiar;
    JComboBox cbxOperaciones;

    public Calculadora() {
        String [] OpcionesCbx = {"+", "-", "/", "*"};
        
        //Modificación de la ventana
        setLayout(null);
        
        //Modificación de las etiquetas
        
        //JLabel
        jlNumber1 = new JLabel("Número 1: ");
        jlNumber1.setBounds(10, 15, 70, 25);
        add(jlNumber1);
        
        jlNumber2 = new JLabel("Número 2: ");
        jlNumber2.setBounds(10, 70, 70, 25);
        add(jlNumber2);
        
        //JTextfield
        tfNumber1 = new JTextField();
        tfNumber1.setBounds(80, 15, 100, 25);
        add(tfNumber1);
        
        tfNumber2 = new JTextField();
        tfNumber2.setBounds(80, 70, 100, 25);
        add(tfNumber2);
        
        //JButton
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(10,130,80, 25);
        add(btnLimpiar);
        
        //JComboBox
        cbxOperaciones = new JComboBox(OpcionesCbx);
        cbxOperaciones.setBounds(220, 15, 60, 25);
        add(cbxOperaciones);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        Calculadora form1 = new Calculadora();
        form1.setVisible(true);
        form1.setLocationRelativeTo(null);
        form1.setSize(400, 400);
        form1.setTitle("Calculadora en Java");
        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
