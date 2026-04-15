public class Livro extends Publicacao {
    int edicao;
    String editora;
    String isbn;

    public Livro(String titulo, String dataPublicacao, double valorMulta, int edicao, String editora, String isbn) {
        super(titulo, dataPublicacao, valorMulta);
        this.edicao = edicao;
        this.editora = editora;
        this.isbn = isbn;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Livro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Data de Publicação: " + dataPublicacao);
        System.out.println("Editora: " + editora);
        System.out.println("Edição: " + edicao);
        System.out.println("ISBN: " + isbn);
        System.out.println("Valor da Multa: R$ " + valorMulta);
    }
}
