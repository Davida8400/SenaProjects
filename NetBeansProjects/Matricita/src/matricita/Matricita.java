package matricita;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Matricita extends JFrame implements ActionListener {

    JLabel jlDocument, jlDatos, jlDocFound, jlNameFound, jlCareerFound, jlSemesterFound, jlNota1, jlNota2, jlNota3, jlNota4, jlPromedio, jlPromedioLetras;
    JTextField tfDocument;
    JButton btnBuscar;
    String iterationDoc;
    public Matricita() {
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
        jlDocFound.setBounds(10, 150,200,30);
        add(jlDocFound);

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

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            String input = tfDocument.getText();

            int row = Estudiante.length;
            int column = Estudiante[0].length;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    iterationDoc = Estudiante[i][0];
                }
                if (iterationDoc.equals(input)) {
                    jlDatos.setText("Datos del estudiante: ");
                    jlDocFound.setText("Documento: " + iterationDoc);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matricita ventana = new Matricita();
        ventana.setVisible(true);
        ventana.setLocation(400, 100);
        ventana.setSize(500, 500);
        ventana.setTitle("Base de datos estudiantil");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
