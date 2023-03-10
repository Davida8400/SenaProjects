import java.util.ArrayList;
import java.util.List;

public class cicloWhile {
    public static void main(String[] args) {
        int i = 1; int suma = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();
        while (i <= 10){
            suma+=i;
            if (i % 2 == 0){
                sumaPares+=i;
                pares.add(sumaPares);
            } else{
                sumaImpares+=i;
                impares.add(sumaImpares);
            }
            System.out.print(suma + " ");
            i++;
        }
        System.out.println("\n" + "Lista de pares: " + pares);
        System.out.println("Lista de impares: " + impares);
    }
}