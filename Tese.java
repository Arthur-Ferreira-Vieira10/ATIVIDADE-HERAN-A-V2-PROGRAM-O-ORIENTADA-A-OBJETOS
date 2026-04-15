public class Tese extends Publicacao {
    int numeroPaginas;
    String resumo;
    String dataDefesa;
    String instituicao;

    public Tese(String titulo, String dataPublicacao, double valorMulta, int numeroPaginas, String resumo, String dataDefesa, String instituicao) {
        super(titulo, dataPublicacao, valorMulta);
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Tese ===");
        System.out.println("Título: " + titulo);
        System.out.println("Data de Publicação: " + dataPublicacao);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Resumo: " + resumo);
        System.out.println("Data da Defesa: " + dataDefesa);
        System.out.println("Instituição: " + instituicao);
        System.out.println("Valor da Multa: R$ " + valorMulta);
    }
}
