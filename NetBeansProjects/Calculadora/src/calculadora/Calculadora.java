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
//Definición de la interfaz

    interface Operaciones {

        int aplicar(int a, int b);
    }

    Operaciones suma = (a, b) -> a + b;
    Operaciones resta = (a, b) -> a - b;
    Operaciones multiplicacion = (a, b) -> a * b;
    Operaciones division = (a, b) -> a / b;
    
    String operador;
    Operaciones operacion;

//Definición de variables
    String[] OpcionesCbx = {"+", "-", "/", "*"};

//Definición de etiquetas
    JLabel jlNumber1, jlNumber2;
    JTextField tfNumber1, tfNumber2;
    JButton btnLimpiar;
    JComboBox cbxOperaciones;

    public Calculadora() {

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
        btnLimpiar = new JButton("enviar");
        btnLimpiar.setBounds(10, 130, 80, 25);
        btnLimpiar.addActionListener(this);
        add(btnLimpiar);

        //JComboBox
        cbxOperaciones = new JComboBox(OpcionesCbx);
        cbxOperaciones.setBounds(220, 15, 60, 25);
        add(cbxOperaciones);
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(tfNumber1.getText());
        int n2 = Integer.parseInt(tfNumber2.getText());
        switch (cbxOperaciones.getSelectedIndex()) {
            case 0 -> operacion = suma;
            case 1 -> operacion = resta;
            case 2 -> operacion = division;
            case 3 -> operacion = multiplicacion;
            default -> operacion = null;
        }
        if (operacion != null) {
            if (operacion == division) {
                float resultado = operacion.aplicar(n1, n2);
                System.out.println("El resultado es: " + resultado);
            } else {
                int resultado = operacion.aplicar(n1, n2);
                System.out.println("El resultado es: " + resultado);
            } 
        } else {
            System.out.println("Error 101: Operación inválida");
        }
        
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
