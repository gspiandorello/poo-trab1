import java.util.ArrayList;

public class CadastroGeral {

    private static ArrayList<Participante> participantes = new ArrayList<Participante>();
    private static ArrayList<Livro> livros = new ArrayList<Livro>();

    public boolean cadastra(Participante participante){
        participantes.add(participante);
        return true;
    }

    public boolean cadastra(Livro livro) {
        livros.add(livro);
        return true;
    }

    public String pesquisaTudo(){
        if(participantes.isEmpty()){
            return null;
        }
        String part = "";
        for(Participante p : participantes){
            part += p.toString();
        }
        return part;
    }

    public Participante pesquisa(int codigo) {
        for (Participante p : participantes) {
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        return null;
    }


    public Livro pesquisa(String nome){
        for(Livro l : livros){
            if(l.getNome().equals(nome)){
                return l;
            }
        }
        return null;
    }
}
