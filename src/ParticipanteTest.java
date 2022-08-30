import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ParticipanteTest {

    Participante p = new Participante(1, "teste@gmail.com");
    Livro l = new Livro("testeNome", "testeAutor", 12345);
    ArrayList<Livro> livrosParticipantes =  new ArrayList<Livro>();

    @Test
    void addLivro() {
        p.addLivro(l);
        String s = "\nParticipante{" +
                "codigo=" + p.getCodigo() +
                ", email='" + p.getEmail() + '\'' +
                ", \nLivro(s) do Participante = [" + l +
                "]}";
        assertEquals(s, p.toString());
    }

    @Test
    void getCodigo() {
        assertEquals(1, p.getCodigo());
    }

    @Test
    void getEmail() {
        assertEquals("teste@gmail.com", p.getEmail());
    }

    @Test
    void setCodigo() {
        p.setCodigo(2);
        assertEquals(2, p.getCodigo());
    }

    @Test
    void setEmail() {
        p.setEmail("outroTeste@gmail.com");
        assertEquals("outroTeste@gmail.com", p.getEmail());
    }

    @Test
    void testToString() {
        p.addLivro(l);
        String s = "\nParticipante{" +
                "codigo=" + p.getCodigo() +
                ", email='" + p.getEmail() + '\'' +
                ", \nLivro(s) do Participante = [" + l +
                "]}";
        assertEquals(s, p.toString());
    }
}