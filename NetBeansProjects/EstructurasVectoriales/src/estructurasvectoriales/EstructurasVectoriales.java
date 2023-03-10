package estructurasvectoriales;
/**
 * @author David
 */
public class EstructurasVectoriales {
    public void Matriz(){
        String Estudiante[][]={
            {"1010899023", "Luis Antonio Valderrama Orjuela", "4.8", "2.9"},
            {"1010899035", "Diana Marcea Céspedes Maldonado", "5.0", "4.9"},
            {"1011235694", "Juan Pablo Miranda Pacheco", "2.9", "1.0"}
        };
        int filas = Estudiante.length;
        int columnas = Estudiante[0].length;
        //la variable i es para las filas
        for (int i = 0; i < filas; i++) {
            //la variable j es para las columnas
            for (int j = 0; j < columnas; j++) {
                System.out.print(Estudiante[i][j] + " ");
            }
            // Estudiante[i][2] significa que accede al indice (2) de la matriz. (0, 1, 2).
            // Estudiante[i][3] significa que accede al indice (3) de la matriz. (0, 1, 2, 3).
            //Esto es porque los números están ubicados en esa posición.
            System.out.println("El promedio es: " + (Double.parseDouble(Estudiante[i][2]) + Double.parseDouble(Estudiante[i][3])) / 2);
        }
    }
    public static void main(String[] args) {
        EstructurasVectoriales Carga = new EstructurasVectoriales();
        Carga.Matriz();
    }
}