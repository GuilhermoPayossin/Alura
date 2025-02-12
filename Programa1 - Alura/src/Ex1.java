public class Ex1 {
    public static void main(String[] args) {
        double media1 = 7.56, media2 = 5.92;
        int resultado = (int)(media1 + media2) / 2;

        System.out.println("Média => " + resultado);

        char o = 'O';
        String nome = "Guilhermo";

        System.out.println(o + " " + nome + " escreveu esse programa em Java!");

        double precoProduto = 49.99;
        int quantidade = 10;

        System.out.println("Valor total = " + precoProduto * quantidade);

        double valorEmDolar = 10.99;
        System.out.println("Valor em Reais = " + (valorEmDolar * 4.94));

        double precoOriginal = 44.99, percentualDesconto = 15;
        System.out.println("Valor em Desconto = " + (precoOriginal - (precoOriginal * (percentualDesconto / 100))));
    }
}
