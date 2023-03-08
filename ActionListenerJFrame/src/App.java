import javax.swing.*;
public class App extends JFrame{
    public App() {
        setLayout(null);
    }
    
    public static void main(String[] ar) {
        App formulario1=new App();
        formulario1.setBounds(10,20,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}