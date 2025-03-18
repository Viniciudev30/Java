import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(19);
        numeros.add(30);
        numeros.add(10);
        numeros.add(100);

        Collections.sort(numeros);

        System.out.println("Lista pronta: " + numeros);

    }
}
