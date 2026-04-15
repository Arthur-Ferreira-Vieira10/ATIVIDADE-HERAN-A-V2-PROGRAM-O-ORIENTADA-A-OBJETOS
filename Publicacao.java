import java.util.ArrayList;

public abstract class Publicacao {
    String titulo;
    String dataPublicacao;
    double valorMulta;
    ArrayList<Autor> autores;
    ArrayList<Publicacao> referencias;

    public Publicacao(String titulo, String dataPublicacao, double valorMulta) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.valorMulta = valorMulta;
        this.autores = new ArrayList<>();
        this.referencias = new ArrayList<>();
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public void adicionarReferencia(Publicacao publicacao) {
        referencias.add(publicacao);
    }

    public abstract void exibirDados();
}
