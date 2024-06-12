package main.java.list.pesquisa;

public class Livro {
    //atributo
    private String titulo;
    private String auto;
    private int anoPublicacao;

    public Livro(String titulo, String auto, int anoPublicacao) {
        this.titulo = titulo;
        this.auto = auto;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAuto() {
        return auto;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", auto='" + auto + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
