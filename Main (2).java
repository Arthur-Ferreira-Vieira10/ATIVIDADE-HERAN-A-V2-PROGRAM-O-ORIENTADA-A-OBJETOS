public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua das Flores, 100");

        Autor autor1 = new Autor("João Silva", "Doutor");
        Autor autor2 = new Autor("Maria Souza", "Mestre");

        Livro livro = new Livro("Java POO", "2020-01-10", 5.0, 3, "Editora Tech", "978-3-16-148410-0");
        livro.adicionarAutor(autor1);

        Artigo artigo = new Artigo("Herança em Java", "2021-06-15", 3.0, "Este artigo aborda herança em Java.");
        artigo.adicionarAutor(autor2);
        artigo.adicionarReferencia(livro);

        Tese tese = new Tese("Padrões de Projeto", "2019-03-20", 7.0, 120, "Estudo sobre padrões de projeto.", "2019-03-18", "IF Goiano");
        tese.adicionarAutor(autor1);

        biblioteca.adicionarPublicacao(livro);
        biblioteca.adicionarPublicacao(artigo);
        biblioteca.adicionarPublicacao(tese);

        System.out.println();
        livro.exibirDados();
        System.out.println();
        artigo.exibirDados();
        System.out.println();
        tese.exibirDados();

        UsuarioComum usuarioComum = new UsuarioComum("Carlos", "64999990001", "carlos@email.com", "111.222.333-44");
        UsuarioEspecial usuarioEspecial = new UsuarioEspecial("Ana", "64999990002", "ana@email.com", "555.666.777-88");

        System.out.println();
        Emprestimo emp1 = biblioteca.realizarEmprestimo(livro, usuarioComum);
        biblioteca.realizarEmprestimo(artigo, usuarioComum);

        System.out.println();
        Emprestimo emp2 = biblioteca.realizarEmprestimo(artigo, usuarioEspecial);
        Emprestimo emp3 = biblioteca.realizarEmprestimo(tese, usuarioEspecial);

        System.out.println();
        emp1.renovar();
        emp1.renovar();
        emp1.renovar();
        emp1.renovar();

        System.out.println();
        biblioteca.devolverEmprestimo(emp1);

        System.out.println();
        biblioteca.devolverEmprestimo(emp2);
    }
}
