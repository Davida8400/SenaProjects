package AerolineaDavid.src;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class DavidAirlines extends JFrame implements ActionListener {
    //Texto
    JLabel jlNombres, jlApellidos, jlDireccion, jlTelefono,
     jlCorreo, jlEdad, jlPesoEquipaje, jlPesoExcedido, jlGenero;
    //Campos de Texto
    JTextField tfNombres, tfApellidos, tfDireccion, tfTelefono,
     tfCorreo, tfEdad, tfPesoEquipaje, tfPesoExcedido;
    //Botones
    String strGenero;
    JButton btnRegistrarse, btnLimpiar, btnExit;
    JRadioButton rbtnMasculino, rbtnFemenino;
    ButtonGroup bg;

    public DavidAirlines(){
        setLayout(null);//Permite la ubicación de un elemento real
        jlNombres=new JLabel("Nombres");
        jlNombres.setBounds(10,20,100,30);
        add(jlNombres);

        jlApellidos=new JLabel("Apellidos");
        jlApellidos.setBounds(350,20,100,30);
        add(jlApellidos);

        jlDireccion=new JLabel("Dirección");
        jlDireccion.setBounds(10,70,100,30);
        add(jlDireccion);

        jlTelefono=new JLabel("Teléfono");
        jlTelefono.setBounds(350,70,100,30);
        add(jlTelefono);

        jlCorreo=new JLabel("Email");
        jlCorreo.setBounds(10,120,100,30);
        add(jlCorreo);

        jlEdad=new JLabel("Edad");
        jlEdad.setBounds(350,120,100,30);
        add(jlEdad);

        jlGenero=new JLabel("Género");
        jlGenero.setBounds(10,220,100,30);
        add(jlGenero);

        jlPesoEquipaje=new JLabel("Equipaje");
        jlPesoEquipaje.setBounds(10,170,100,30);
        add(jlPesoEquipaje);

        jlPesoExcedido=new JLabel("Kilos Excedidos");
        jlPesoExcedido.setBounds(350,170,100,30);
        add(jlPesoExcedido);


        tfNombres=new JTextField();
        tfNombres.setBounds(110, 20, 150, 30);
        add(tfNombres);

        tfApellidos=new JTextField();
        tfApellidos.setBounds(450, 20, 150, 30);
        add(tfApellidos);

        tfDireccion=new JTextField();
        tfDireccion.setBounds(110, 70, 150, 30);
        add(tfDireccion);

        tfTelefono=new JTextField();
        tfTelefono.setBounds(450, 70, 150, 30);
        add(tfTelefono);

        tfCorreo=new JTextField();
        tfCorreo.setBounds(110, 120, 150, 30);
        add(tfCorreo);

        tfEdad=new JTextField();
        tfEdad.setBounds(450, 120, 50, 30);
        add(tfEdad);

        tfPesoEquipaje=new JTextField();
        tfPesoEquipaje.setBounds(110, 170, 50, 30);
        add(tfPesoEquipaje);

        tfPesoExcedido=new JTextField();
        tfPesoExcedido.setBounds(450, 170, 50, 30);
        add(tfPesoExcedido);

        btnRegistrarse=new JButton("Registrarse");
        btnRegistrarse.setBounds(120, 550, 100, 30);
        add(btnRegistrarse);
        btnRegistrarse.addActionListener(this);

        btnLimpiar=new JButton("Limpiar");
        btnLimpiar.setBounds(350, 550, 100, 30);
        add(btnLimpiar);
        btnLimpiar.addActionListener(this);

        btnExit=new JButton("Exit");
        btnExit.setBounds(500, 550, 100, 30);
        add(btnExit);
        btnExit.addActionListener(this);

        rbtnMasculino=new JRadioButton("Masculino");
        rbtnMasculino.setBounds(110, 220, 90, 30);
        add(rbtnMasculino);

        rbtnFemenino=new JRadioButton("Femenino");
        rbtnFemenino.setBounds(210, 220, 90, 30);
        add(rbtnFemenino);

        bg=new ButtonGroup();
        bg.add(rbtnMasculino);
        bg.add(rbtnFemenino);
    }
    public void actionPerformed(ActionEvent e){
        String strNombres;
        String strApellidos;
        String strDireccion;
        String strTelefono;
        String strCorreo;
        String strEdad;
        String strPesoEquipaje;
        String strPesoExcedido;
        String strGenero = null;
        if(e.getSource()==btnRegistrarse){
            strNombres=tfNombres.getText();
            strApellidos=tfApellidos.getText();
            strDireccion=tfDireccion.getText();
            strTelefono=tfTelefono.getText();
            strCorreo=tfCorreo.getText();
            strEdad=tfEdad.getText();
            strPesoEquipaje=tfPesoEquipaje.getText();
            strPesoExcedido=tfPesoExcedido.getText();
            if(rbtnMasculino.isSelected()){
                strGenero=rbtnMasculino.getText();
            }
            else  if(rbtnFemenino.isSelected()){
                strGenero=rbtnFemenino.getText();
            }
            JOptionPane.showMessageDialog(null, "¡Hola " + strNombres +
                    "!, queremos saber si tus datos son correctos:\n" +
                    "Nombres: " + strNombres + "\n" +
                    "Apellidos: " + strApellidos + "\n" +
                    "Dirección: " + strDireccion + "\n" +
                    "Teléfono: " + strTelefono + "\n" +
                    "Correo: " + strCorreo + "\n" +
                    "Edad: " + strEdad + "\n" +
                    "Peso de equipaje: " + strPesoEquipaje + "\n" +
                    "Exceso de peso: " + strPesoExcedido + "\n" +
                    "Género: " + strGenero);
        }

        else if(e.getSource()==btnLimpiar){
            tfNombres.setText("");
            tfApellidos.setText("");
            tfDireccion.setText("");
            tfTelefono.setText("");
            tfCorreo.setText("");
            tfEdad.setText("");
            tfPesoEquipaje.setText("");
            tfPesoExcedido.setText("");
        }
        else if(e.getSource()==btnExit){
            dispose();
        }
    }

    public static void main(String[] args) {
        DavidAirlines formulario = new DavidAirlines();
        formulario.setBounds(20, 20, 700, 700);
        formulario.setTitle("David Airlines");
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
