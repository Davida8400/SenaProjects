package ventana;

import javax.swing.JFrame;
public class Ventana extends JFrame {
    public  Ventana(){
    this.setTitle("Operaciones"); //Se puede utilizar this. o el método requerido sin el this.
    this.setSize(300, 200); //Tamaño de la ventana
    this.setLocation(500, 300); //Localización del archivo
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    }
}
