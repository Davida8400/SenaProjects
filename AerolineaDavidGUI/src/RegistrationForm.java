import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JDialog {
    private JTextField tfNombre;
    private JTextField tfDireccion;
    private JTextField tfEmail;
    private JTextField tfTelefono;
    private JTextField tfApellido;
    private JButton btnRegistrarme;
    private JButton btnCancelar;
    private JRadioButton rbtnMasculino;
    private JRadioButton rbtnFemenino;
    private JTextField tfEdad;
    private JPanel registerPanel;
    private JTextField tfPesoEquipaje;
    private JTextField tfKilosDeExceso;
    private JLabel jlNombres;
    private JLabel jlApellidos;
    private JLabel jlDireccion;
    private JLabel jlTelefono;
    private JLabel jlEmail;
    private JLabel jlEdad;
    private JLabel jlEquipaje;
    private JLabel jlGenero;
    private JLabel jlRegistroTitulo;
    private JLabel jlAirlineLogo;
    private JButton btnLimpiar;

    public RegistrationForm(JFrame parent){
        super(parent);
        setTitle("Create a new account");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(470, 570));
        setModal(true);
        setLocationRelativeTo(parent);
        btnRegistrarme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }

        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registerUser() {
        String name = tfNombre.getText();
    }


    public static void main(String[] args) {
        RegistrationForm myForm = new RegistrationForm(null);
    }
}
