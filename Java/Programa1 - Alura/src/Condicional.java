public class Condicional {
    public static void main(String[] args) {

        int anoLancamento = 2022;
        boolean inclusoNoPlano = false;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale apena assistir");
        }

        if (inclusoNoPlano || tipoPlano.equalsIgnoreCase("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Filme Indisponível");
        }
    }
}
