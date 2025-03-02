package br.com.alura.screenmatch.exeptions;

public class ConversaoDeAnoExeption extends RuntimeException {
    private String mensagem;

    public ConversaoDeAnoExeption(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
