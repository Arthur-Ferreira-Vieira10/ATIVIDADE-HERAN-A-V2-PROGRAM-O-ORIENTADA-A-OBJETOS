public class Emprestimo {
    Publicacao publicacao;
    Usuario usuario;
    int renovacoes;

    public Emprestimo(Publicacao publicacao, Usuario usuario) {
        this.publicacao = publicacao;
        this.usuario = usuario;
        this.renovacoes = 0;
    }

    public void renovar() {
        renovacoes++;
        System.out.println("Empréstimo renovado. Total de renovações: " + renovacoes);
    }

    public double devolver() {
        double multa = 0;
        if (renovacoes > 3) {
            multa = (renovacoes - 3) * publicacao.valorMulta;
            System.out.println("Publicação devolvida com multa de R$ " + multa);
        } else {
            System.out.println("Publicação devolvida sem multa.");
        }
        return multa;
    }
}
