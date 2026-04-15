import java.util.ArrayList;

public abstract class Usuario {
    String nome;
    String telefone;
    String email;
    String cpf;
    ArrayList<Emprestimo> emprestimos;

    public Usuario(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.emprestimos = new ArrayList<>();
    }

    public abstract boolean podeEmprestar();

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }
}
