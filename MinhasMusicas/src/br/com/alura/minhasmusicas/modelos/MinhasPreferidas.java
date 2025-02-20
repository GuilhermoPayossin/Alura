package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void incluir (Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado um sucesso absoluto e preferido por todos");
            return;
        }
        System.out.println(audio.getTitulo() + " tembém é bem curtido por muitos usuários");
    }
}
