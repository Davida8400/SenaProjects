import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
public class Ambiente_grafico extends JFrame implements ActionListener{

        JLabel Etiqueta1, Etiqueta2;
        JTextField Los_Nombres;
        JTextField Los_Apellidos;
        JButton Titulo,Borrar;
        
        public Ambiente_grafico(){ //Constructor de la clase
            setLayout(null);
            Etiqueta1=new JLabel("Nombres");
            Etiqueta1.setBounds(10,20,100,30);
            add(Etiqueta1);
            Los_Nombres=new JTextField();
            Los_Nombres.setBounds(100, 20, 200, 30);
            add(Los_Nombres);
            Titulo=new JButton("Haga Click");
            Titulo.setBounds(100, 150, 100, 30);
            add(Titulo);
            Titulo.addActionListener(this);
            Borrar=new JButton("Limpiar");
            Borrar.setBounds(350, 150, 100, 30);
            add(Borrar);
            Borrar.addActionListener(this);
        }
        
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==Titulo){
                Los_Nombres.setText("Andrés");
                this.setTitle("Aprendiz 2582984");
                
                }
            
            if(e.getSource()==Borrar)
               Los_Nombres.setText("");
        }
    
    public static void main(String[] args) {
        Ambiente_grafico formulario=new Ambiente_grafico();
        formulario.setBounds(20,20,600,500);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}