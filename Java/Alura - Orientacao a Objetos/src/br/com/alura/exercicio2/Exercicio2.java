package br.com.alura.exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {

        contaBancaria conta1= new contaBancaria();
        idadePessoa pessoa1 = new idadePessoa();
        idadePessoa pessoa2 = new idadePessoa();
        Produto produto1 = new Produto();
        Aluno aluno1 = new Aluno();
        Livro livro1 = new Livro();

        System.out.println("\n*********************\n");

        conta1.titular = "Júlia";
        conta1.setNumeroConta(1234);
        conta1.setSaldo(1500);

        System.out.println("Nome do titular: " + conta1.titular);
        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo disponível: R$" + conta1.getSaldo());

        System.out.println("\n*********************\n");

        pessoa1.setNome("Luis");
        pessoa1.setIdade(19);

        pessoa2.setNome("Carol");
        pessoa2.setIdade(16);

        pessoa1.checarIdade();
        System.out.println("\n---------------------\n");
        pessoa2.checarIdade();

        System.out.println("\n*********************\n");

        produto1.setNome("Prato");
        produto1.setPreco(15.99);

        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Preço do produto: R$" + produto1.getPreco());
        System.out.print("Preco do produto com desconto aplicado: R$");
        produto1.aplicarDesconto(15);

        System.out.println("\n*********************\n");

        aluno1.setNome("Maria");
        aluno1.somarNotas(8.5);
        aluno1.somarNotas(6.75);
        aluno1.somarNotas(5.25);

        System.out.println(aluno1.getNome() + " ficou com " + String.format("%.2f", aluno1.calcularMedia()) + " pontos na média");

        System.out.println("\n*********************\n");

        livro1.setTitulo("O Homem de Giz");
        livro1.setAutor("C. J. Tudor");

        livro1.exibirLivro();

        System.out.println("\n*********************\n");
        System.out.println("Fim da execução");
    }
}
