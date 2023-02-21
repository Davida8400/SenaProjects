import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class AerolineaVictor extends JFrame implements ActionListener{
    JLabel Eti_Nombres, Eti_Apellidos,EtiDireccion,EtiTelefono,EtiCorreo,EtiEdad;
    JLabel Eti_PesoEquipaje, Eti_Genero, Eti_KilosExcedidos;
    JTextField Los_Nombres, Los_Apellidos;
    JTextField Direccion, Telefono, Correo, Edad, PesoEquipaje, Genero,KilosExcedidos;
    JButton Tiquete,Borrar;

    public AerolineaVictor(){ //Constructor de la clase
        setLayout(null);//Permite la ubicación de un elemento real
        Eti_Nombres=new JLabel("Nombres");
        Eti_Nombres.setBounds(10,20,100,30);
        add(Eti_Nombres);
        Eti_Apellidos=new JLabel("Apellidos");
        Eti_Apellidos.setBounds(350,20,100,30);
        add(Eti_Apellidos);
        EtiDireccion=new JLabel("Dirección");
        EtiDireccion.setBounds(10,70,100,30);
        add(EtiDireccion);
        EtiTelefono=new JLabel("Teléfono");
        EtiTelefono.setBounds(350,70,100,30);
        add(EtiTelefono);
        EtiCorreo=new JLabel("Email");
        EtiCorreo.setBounds(10,120,100,30);
        add(EtiCorreo);
        EtiEdad=new JLabel("Edad");
        EtiEdad.setBounds(350,120,100,30);
        add(EtiEdad);
        Eti_Genero=new JLabel("Su Género");
        Eti_Genero.setBounds(10,170,100,30);
        add(Eti_Genero);
        Eti_PesoEquipaje=new JLabel("Peso de Equipaje");
        Eti_PesoEquipaje.setBounds(350,170,100,30);
        add(Eti_PesoEquipaje);
        Eti_KilosExcedidos=new JLabel("Kilos Excedidios");
        Eti_KilosExcedidos.setBounds(10,220,100,30);
        add(Eti_KilosExcedidos);


        Los_Nombres=new JTextField();
        Los_Nombres.setBounds(110, 20, 200, 30);
        add(Los_Nombres);
        Los_Apellidos=new JTextField();
        Los_Apellidos.setBounds(450, 20, 200, 30);
        add(Los_Apellidos);
        Direccion=new JTextField();
        Direccion.setBounds(110, 70, 200, 30);
        add(Direccion);
        Telefono=new JTextField();
        Telefono.setBounds(450, 70, 140, 30);
        add(Telefono);
        Correo=new JTextField();
        Correo.setBounds(110, 120, 200, 30);
        add(Correo);
        Edad=new JTextField();
        Edad.setBounds(450, 120, 50, 30);
        add(Edad);
        Genero=new JTextField();
        Genero.setBounds(110, 170, 90, 30);
        add(Genero);
        PesoEquipaje=new JTextField();
        PesoEquipaje.setBounds(450, 170, 50, 30);
        add(PesoEquipaje);
        KilosExcedidos=new JTextField();
        KilosExcedidos.setBounds(110, 220, 90, 30);
        add(KilosExcedidos);

        Tiquete=new JButton("Imprimir");
        Tiquete.setBounds(100, 550, 100, 30);
        add(Tiquete);
        Tiquete.addActionListener(this);

        Borrar=new JButton("Limpiar");
        Borrar.setBounds(350, 550, 100, 30);
        add(Borrar);
        Borrar.addActionListener(this);


    }

    public void actionPerformed(ActionEvent Oyente){
        if(Oyente.getSource()==Tiquete){
            int EquipajeExcedido=0;
            String PEquipaje,KilosdeExcesos;
            PEquipaje=PesoEquipaje.getText();
            EquipajeExcedido=Integer.parseInt(PEquipaje)-20;
            KilosdeExcesos=String.valueOf(EquipajeExcedido);
            KilosExcedidos.setText(KilosdeExcesos);
            //JOptionPane.showMessageDialog(null, "Usted se excedió en "+EquipajeExcedido+" Kilos");
        }

        if(Oyente.getSource()==Borrar)//Al hacer Click sobre el Botón Borrar
            Los_Nombres.setText("");
    }

    public static void main(String[] args) {
        AerolineaVictor formulario=new AerolineaVictor();//Se Instancia la clase AerolineaVictor
        formulario.setBounds(20,20,700,700);
        formulario.setTitle("Aerolinea Avianca");
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}