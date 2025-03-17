import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.calculo(5);
        System.out.println(resultado);


        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);



    

    }
}