import java.util.ArrayList;

public class Participante {

    private int codigo;
    private String email;
    private ArrayList<Livro> livrosParticipantes =  new ArrayList<Livro>();

    public void addLivro(Livro livro){
        livrosParticipantes.add(livro);
    }

    public Participante (int codigo, String email){
        this.codigo = codigo;
        this.email = email;
    }

    public Participante(int codigo){
        this.codigo = codigo;
        email = null;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getEmail(){
        return email;
    }

    public void setCodigo(int novoCodigo){
        codigo = novoCodigo;
    }

    public void setEmail(String novoEmail){
        email = novoEmail;
    }

    @Override
    public String toString() {
        return "\nParticipante{" +
                "codigo=" + codigo +
                ", email='" + email + '\'' +
                ", \nLivro(s) do Participante = " + livrosParticipantes +
                '}';
    }
}
