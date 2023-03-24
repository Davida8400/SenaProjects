package matrices;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Matrices extends JFrame implements ActionListener {

    JLabel jlDocument;
    JTextField tfDocument;
    JButton btnBuscar;
    public Matrices() {
        setLayout(null); //elimina el diseño por defecto de una ventana, para poder hacerlo manualmente
        jlDocument = new JLabel("Documento: ");
        jlDocument.setBounds(10, 20, 100, 30);
        add(jlDocument);

        tfDocument = new JTextField();
        tfDocument.setBounds(90, 20, 100, 30);
        add(tfDocument);
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(90, 60, 100, 30);
        add(btnBuscar);
    }
            

    public void Arreglo() {
        String Estudiante[][] = {
            {"51662369", "Sandra Milena Castellanos Marín", "Medicina", "VI", "3.5", "4.0", "3.3", "3.5"},
            {"80223220", "Luis Andrés Montoya Montoya", "Ingeniería de Telecomunicaciones", "IV", "3.0", "3.3", "4.2", "4.5"},
            {"79444555", "Francisco Martínez Marin", "Ingeniería de Alimentos", "III", "3.4", "4.5", "4.4", "3.0"},
            {"79001003", "Luis Francisco Castañeda Roa", "Ingeniería de Sistemas", "VIII", "3.3", "3.4", "4.5", "4.4"},
            {"79003003", "Pedro José Pineda Pineda", "Odontología", "VI", "4.0", "4.1", "3.9", "4.5"},
            {"52900901", "Ruth Paola Mahecha Mahecha", "Odontología", "VII", "3.6", "3.6", "3.8", "3.9"},
            {"26900345", "Lucia Valderrama Pineda", "Fisioterapia", "VIII", "4.4", "4.5", "4.1", "3.1"},
            {"35676900", "Mariela Lucia Olguín Ramírez", "Medicina", "V", "3.0", "3.1", "4.6", "3.7"},
            {"27101234", "Lucila Peñaranda Peñaranda", "Enfermería", "II", "2.5", "4.6", "3.4", "4.6"},
            {"80231678", "Milena Palacios Palacios", "Ingeniería Mecánica", "III", "3.6", "3.4", "3.5", "4.5"},
            {"1030617979", "Luis Alberto Castellanos Frias", "Odontología", "VI", "4.0", "4.1", "3.9", "4.5"},
            {"1019066342", "Nercy Aleidis Rengifo Rengifo", "Fisioterapia", "VII", "3.6", "3.6", "3.8", "3.9"},
            {"1014249436", "Fabián Raúl Moreno Carvajal", "Medicina", "VIII", "4.4", "4.5", "4.1", "3.1"},
            {"1022380843", "Jonathan Mauricio Baez Baez", "Enfermería", "V", "3.0", "3.1", "4.6", "3.7"},
            {"1012353083", "Germán Dario Rodríguez Baez", "Ingeniería Mecánica", "II", "2.5", "4.6", "3.4", "4.6"},
            {"1030630231", "Diego Fernando Giraldo Romero", "Ingeniería de Petróleo", "III", "3.6", "3.4", "3.5", "4.5"},
            {"1020765332", "Luz Herminda Fonseca Daza", "Psicología", "VI", "4.0", "4.1", "3.9", "4.5"},
            {"1022357137", "Rhonald Dahian Jiménez García", "Ingeniería Civil", "VI", "3.5", "4.0", "3.3", "3.5"},
            {"52263227", "Edgar Andrés Bejarano Pérez", "Ingeniería Civil", "IV", "3.0", "3.3", "4.2", "4.5"},
            {"1013579638", "Diego Fernando Bautista Gómez", "Ingeniería Civil", "III", "3.4", "4.5", "4.4", "3.0"},
            {"1030617979", "Luis Alberto Jaime Hernández", "Ingeniería  de Sistemas", "II", "4.0", "4.1", "3.9", "4.5"},
            {"1019066342", "Zabala Pereira Nercy Aleidys", "Ingeniería Mecánica", "V", "3.0", "3.3", "4.2", "4.5"},
            {"1014249436", "Fabian Raul Duarte Serrano", "Medicina", "IV", "3.6", "3.6", "3.8", "3.9"},
            {"1022380843", "Jhonatan Mauricio Rodríguez  C.", "Ingeniería de Petróleos", "I", "3.4", "4.5", "4.4", "3.0"},
            {"1012353083", "German Dario González  Riaño", "Ingeniería de Petróleos", "III", "3.4", "4.5", "4.4", "3.0"},
            {"96040605441", "Michael Duvan Beltran Salcedo", "Medicina", "IV", "3.0", "3.3", "4.2", "4.5"},
            {"1013641467", "Romero Piña Dylan David", "Fisioterapia", "II", "3.6", "3.6", "3.8", "3.9"},
            {"1030632107", "Ruben Dario Fuquene C.", "Ingeniería Mecánica", "V", "3.0", "3.3", "4.2", "4.5"},
            {"53072770", "Maryory Cuesta Rodríguez", "Ingeniería de Telecomunicaciones", "IV", "3.0", "3.3", "4.2", "4.5"},
            {"1014245401", "Cristian Camilo Ortiz Ortiz", "Ingeniería de Telecomunicaciones", "VI", "2.0", "3.1", "4.8", "1.5"},
            {"95070115361", "Yuly Katherine Sierra", "Ingeniería Mecánica", "V", "2.7", "3.9", "4.7", "4.5"},
            {"1020796896", "Daniel Andres Zapata Bello", "Ingeniería Mecánica", "IV", "3.0", "3.3", "4.2", "4.5"},
            {"1003819124", "José Eitner Montiel  Aldana", "Medicina", "IV", "3.0", "3.3", "4.2", "4.5"},
            {"1031131906", "Luis Guillermo Andrade Cifuentes", "Medicina", "VIII", "3.9", "3.8", "2.6", "4.5"},
            {"1019018284", "Jairo Joel Noguera melo", "Medicina", "VIII", "3.7", "3.7", "4.7", "4.0"},
            {"1014218719", "Bryan Andrés Ortegón", "Medicina", "IV", "3.0", "3.3", "4.2", "4.5"},
            {"1030611565", "Mónica Andrea Plaza Bernal", "Medicina", "IV", "3.6", "3.8", "4.8", "4.0"}
        };
        
        String nTexto = null, nTexto2 = null;
        boolean jugo = false;
        int filas = Estudiante.length;
        int columnas = Estudiante[0].length;
        String[][] pSplit = new String[filas][2];
        if (jugo) {
            
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(Estudiante[i][j] + " ");
                }
                double promedio = (Double.parseDouble(Estudiante[i][4])
                        + Double.parseDouble(Estudiante[i][5])
                        + Double.parseDouble(Estudiante[i][6])
                        + Double.parseDouble(Estudiante[i][7])) / 4;
                String promedioFormat = String.format("%.1f", promedio);
                System.out.println("El promedio es: " + promedioFormat);
                String[] partes = promedioFormat.split(",");
                pSplit[i][0] = partes[0];
                pSplit[i][1] = partes[1];

                switch (pSplit[i][0]) {
                    case "0":
                        nTexto = "cero";
                        break;
                    case "1":
                        nTexto = "uno";
                        break;
                    case "2":
                        nTexto = "dos";
                        break;
                    case "3":
                        nTexto = "tres";
                        break;
                    case "4":
                        nTexto = "cuatro";
                        break;
                    case "5":
                        nTexto = "cinco";
                        break;
                    case "6":
                        nTexto = "seis";
                        break;
                    case "7":
                        nTexto = "siete";
                        break;
                    case "8":
                        nTexto = "ocho";
                        break;
                    case "9":
                        nTexto = "nueve";
                        break;
                }
                switch (pSplit[i][1]) {
                    case "0":
                        nTexto2 = "cero";
                        break;
                    case "1":
                        nTexto2 = "uno";
                        break;
                    case "2":
                        nTexto2 = "dos";
                        break;
                    case "3":
                        nTexto2 = "tres";
                        break;
                    case "4":
                        nTexto2 = "cuatro";
                        break;
                    case "5":
                        nTexto2 = "cinco";
                        break;
                    case "6":
                        nTexto2 = "seis";
                        break;
                    case "7":
                        nTexto2 = "siete";
                        break;
                    case "8":
                        nTexto2 = "ocho";
                        break;
                    case "9":
                        nTexto2 = "nueve";
                        break;
                }
                System.out.println(" El promedio es: " + nTexto + " punto " + nTexto2);
            }
        }
        /**
         * @param args the command line arguments
         */
    }

    public static void main(String[] args) {
        Matrices Load = new Matrices();
        Load.Arreglo();
        Matrices formulario = new Matrices();
        formulario.setVisible(true);
        formulario.setSize(600, 600);
        formulario.setLocationRelativeTo(null); //permite ubicar la ventana en el centro de la pantalla
        formulario.setTitle("Base de datos estudiantil");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
