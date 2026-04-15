public class Artigo extends Publicacao {
    String resumo;

    public Artigo(String titulo, String dataPublicacao, double valorMulta, String resumo) {
        super(titulo, dataPublicacao, valorMulta);
        this.resumo = resumo;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Artigo ===");
        System.out.println("Título: " + titulo);
        System.out.println("Data de Publicação: " + dataPublicacao);
        System.out.println("Resumo: " + resumo);
        System.out.println("Valor da Multa: R$ " + valorMulta);
    }
}
