package estructurasvectoriales;

/**
 *
 * @author David
 */
public class EstructurasVectoriales {
    public void Matriz(){
        String Ciudades[]={"Santiago de Cali", "Bogotá", "Santa Marta", "Barranquilla", "Villavicencio", "Medellín"};
        int cantidad = Ciudades.length;
        for(int i = 0; i < cantidad; i++){
            System.out.println(Ciudades[i]);
        }
    }
    public static void main(String[] args) {
        EstructurasVectoriales Carga = new EstructurasVectoriales();
        Carga.Matriz();
        System.exit(0);
    }
}
