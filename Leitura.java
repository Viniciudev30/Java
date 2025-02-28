import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digtie seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anodeLançamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o Filme ?");
        double avaliaçao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anodeLançamento);
        System.out.println(avaliaçao);
    }
}
