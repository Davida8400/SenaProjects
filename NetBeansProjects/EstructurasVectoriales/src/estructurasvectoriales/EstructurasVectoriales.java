package estructurasvectoriales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author David
 */
public class EstructurasVectoriales implements ActionListener{
    JLabel jlChi, jlVzl, jlUSA, jlArg, jlCol, jlJpn, jlRus, jlInd;
    
    public void Matriz(){
        String Paises [] = {"China", "Venezuela", "Estados Unidos", "Argentina", "Colombia", "Japón", "Rusia", "India"};
        String Ciudades[]={"Santiago de Cali", "Bogotá", "Santa Marta", "Barranquilla", "Villavicencio", "Medellín"};
        int cantidad = Ciudades.length;
        for(int i = 0; i < cantidad; i++){
            System.out.println(Ciudades[i]);
        }
    }
    public static void main(String[] args) {
        EstructurasVectoriales Carga = new EstructurasVectoriales();
        Carga.Matriz();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}