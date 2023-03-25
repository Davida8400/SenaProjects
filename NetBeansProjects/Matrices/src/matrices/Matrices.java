package matrices;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Matrices extends JFrame implements ActionListener {
    JLabel jlDocument, jlDatos, jlDocFound, jlNameFound, jlCareerFound, jlSemesterFound, jlNotas, jlPromedio, jlPromedioLetras;
    JTextField tfDocument;
    JButton btnBuscar;
    String iterationDoc, iterationName, iterationCareer, iterationSemester, n1, n2, n3, n4;
    double iterationPromedio;
    String promedioFormat;
    String [] partes;
    
    public String numerosLetras(String ni){
        //rule switch case
        switch (ni) {
            case "0" ->n1 = "cero";
            case "1" -> n1 = "uno";
            case "2" -> n1 = "dos";
            case "3" -> n1 = "tres";
            case "4" -> n1 = "cuatro";
            case "5" -> n1 = "cinco";
            case "6" -> n1 = "seis";
            case "7" -> n1 = "siete";
            case "8" -> n1 = "ocho";
            case "9" -> n1 = "nueve";
        }
        return n1;
    }
    
    public Matrices() {
        setLayout(null); //elimina el diseño por defecto de una ventana, para poder hacerlo manualmente
        //JLabel

        jlDocument = new JLabel("Documento: ");
        jlDocument.setBounds(10, 20, 100, 30);
        add(jlDocument);

        jlDatos = new JLabel();
        jlDatos.setBounds(10, 120, 150, 30);
        add(jlDatos);

        jlDocFound = new JLabel();
        jlDocFound.setPreferredSize(new Dimension(100, 30));
        jlDocFound.setBounds(10, 150, 200, 30);
        add(jlDocFound);

        jlNameFound = new JLabel();
        jlNameFound.setPreferredSize(new Dimension(100, 30));
        jlNameFound.setBounds(10, 180, 300, 30);
        add(jlNameFound);

        jlCareerFound = new JLabel();
        jlCareerFound.setBounds(10, 210, 200, 30);
        add(jlCareerFound);

        jlSemesterFound = new JLabel();
        jlSemesterFound.setBounds(10, 240, 200, 30);
        add(jlSemesterFound);

        jlNotas = new JLabel();
        jlNotas.setBounds(10, 270, 200, 30);
        add(jlNotas);

        jlPromedio = new JLabel();
        jlPromedio.setBounds(10, 300, 200, 30);
        add(jlPromedio);

        jlPromedioLetras = new JLabel();
        jlPromedioLetras.setBounds(10, 330, 300, 30);
        add(jlPromedioLetras);

        //JTextField
        tfDocument = new JTextField();
        tfDocument.setBounds(90, 20, 100, 30);
        add(tfDocument);

        //JButton
        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(90, 60, 100, 30);
        btnBuscar.addActionListener(this);
        add(btnBuscar);
    }
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
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            String input = tfDocument.getText();
            int row = Estudiante.length;
            int column = Estudiante[0].length;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    iterationDoc = Estudiante[i][0];
                    iterationName = Estudiante[i][1];
                    iterationCareer = Estudiante[i][2];
                    iterationSemester = Estudiante[i][3];
                    n1 = Estudiante[i][4];
                    n2 = Estudiante[i][5];
                    n3 = Estudiante[i][6];
                    n4 = Estudiante[i][7];
                    iterationPromedio = 
                            (Double.parseDouble(n1) +
                            Double.parseDouble(n2) +
                            Double.parseDouble(n3) +
                            Double.parseDouble(n4)) / 4;
                    promedioFormat = String.format("%.1f", iterationPromedio);
                    partes = promedioFormat.split(",");
                }
                if (iterationDoc.equals(input)) {
                    jlDatos.setText("Datos del estudiante: ");
                    jlDocFound.setText("Documento: " + iterationDoc + ".");
                    jlNameFound.setText("Nombre: " + iterationName + ".");
                    jlCareerFound.setText("Carrera: " + iterationCareer + ".");
                    jlSemesterFound.setText("Semestre: " + iterationSemester + ".");
                    jlNotas.setText("Notas: " + n1 + ", " + n2 + ", "  + n3 + ", "  + n4 + ".");
                    jlPromedio.setText("Promedio: " + promedioFormat + ".");
                    jlPromedioLetras.setText("Promedio en letras: " +  numerosLetras(partes[0]) + " punto " +  numerosLetras(partes[1]) + ".");       
                }
            }
        }
    }
    public static void main(String[] args) {
        Matrices ventana = new Matrices();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setSize(350, 420);
        ventana.setTitle("Base de datos estudiantil");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}