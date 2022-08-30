public class Livro {

    private String nome;
    private String autor;
    private int ISBN;
    private Participante p;

    public void addParticipante(Participante participante){
        p = participante;
    }

    public Livro(String nome, String autor, int ISBN){
        this.nome = nome;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
        ISBN = 0;
    }

    public String getNome(){
        return nome;
    }

    public String getAutor(){
        return autor;
    }

    public int getISBN(){
        return ISBN;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setAutor(String novoAutor){
        autor = novoAutor;
    }

    public void setISBN(int novoISBN){
        ISBN = novoISBN;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}
