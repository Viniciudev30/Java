public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2013;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidoNoPlano == true  && tipoPlano.equals("plus")) {
            System.out.printf("Filme liberado");
        } else {
            System.out.printf("Deve paga a locação");
        }
    }
}
