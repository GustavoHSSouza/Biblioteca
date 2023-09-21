// Classe Livro para representar um livro individual
class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor para inicializar os atributos
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Método para mostrar informações do livro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}

// Classe Biblioteca para gerenciar uma coleção de livros
public class Biblioteca {
    private Livro[] livros; // Array para armazenar os livros
    private int quantidadeLivros; // Contador de livros na biblioteca

    // Construtor para inicializar a biblioteca com uma capacidade definida
    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        quantidadeLivros = 0;
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        if (quantidadeLivros < livros.length) {
            livros[quantidadeLivros] = livro;
            quantidadeLivros++;
            System.out.println("Livro adicionado com sucesso!");
        } else {
            System.out.println("Biblioteca cheia. Não é possível adicionar mais livros.");
        }
    }

    // Método para mostrar todos os livros na biblioteca
    public void mostrarLivros() {
        System.out.println("Livros na Biblioteca:");
        for (int i = 0; i < quantidadeLivros; i++) {
            livros[i].mostrarInfo();
            System.out.println();
        }
    }

    // Método main para demonstrar a criação e gerenciamento de uma biblioteca
    public static void main(String[] args) {
        // Criando uma biblioteca com capacidade para 3 livros
        Biblioteca biblioteca = new Biblioteca(2);

        // Criando e adicionando livros
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 1949));
        biblioteca.adicionarLivro(new Livro("Moby-Dick", "Herman Melville", 1851));

        // Tentando adicionar um livro extra (deverá falhar, pois a biblioteca está cheia)
        try{
            biblioteca.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes", 1605));
        }catch(Exception e){
            System.out.println(e.getMessage());

        }

        // Mostrando todos os livros na biblioteca
        biblioteca.mostrarLivros();
    }
}
