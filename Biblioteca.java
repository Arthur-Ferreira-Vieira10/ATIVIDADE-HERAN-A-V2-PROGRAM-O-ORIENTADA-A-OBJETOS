import java.util.ArrayList;

public class Biblioteca {
    String nome;
    String endereco;
    ArrayList<Publicacao> publicacoes;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.publicacoes = new ArrayList<>();
    }

    public void adicionarPublicacao(Publicacao publicacao) {
        publicacoes.add(publicacao);
        System.out.println("Publicação adicionada: " + publicacao.titulo);
    }

    public Emprestimo realizarEmprestimo(Publicacao publicacao, Usuario usuario) {
        if (!usuario.podeEmprestar()) {
            System.out.println("Usuário " + usuario.nome + " não pode realizar mais empréstimos.");
            return null;
        }
        Emprestimo emprestimo = new Emprestimo(publicacao, usuario);
        usuario.adicionarEmprestimo(emprestimo);
        System.out.println("Empréstimo realizado: " + publicacao.titulo + " para " + usuario.nome);
        return emprestimo;
    }

    public void devolverEmprestimo(Emprestimo emprestimo) {
        emprestimo.devolver();
        emprestimo.usuario.removerEmprestimo(emprestimo);
    }
}
