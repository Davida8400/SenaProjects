import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RangoAleatorio {
    public static void main(String[] args) {
        int i; int inicio; int fin; int sumaPares = 0; int sumaImpares = 0;
        List<Integer> aleatorios = new ArrayList<>();
        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese el inicio del rango: ");
        inicio = teclado.nextInt();
        System.out.print("Ingrese el inicio del rango: ");
        fin = teclado.nextInt();

        for(i = inicio; i <= fin; inicio++){
            if(i % 2 == 0){
                sumaPares+=i;
                aleatorios.add(0, sumaPares);
            } else {
                sumaImpares+=i;
                aleatorios.add(1 ,sumaImpares);
            }
        }
        System.out.println(aleatorios[0]);
    }
}
