import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    Participante p = new Participante(1, "teste@gmail.com");
    Livro l = new Livro("testeNome", "testeAutor", 12345);

    @Test
    void addParticipante() {
        l.addParticipante(p);
        p.addLivro(l);
        String s = "\nParticipante{" +
                "codigo=" + p.getCodigo() +
                ", email='" + p.getEmail() + '\'' +
                ", \nLivro(s) do Participante = [" + l +
                "]}";
        assertEquals(s, p.toString());
    }

    @Test
    void getNome() {
        assertEquals("testeNome", l.getNome());
    }

    @Test
    void getAutor() {
        assertEquals("testeAutor", l.getAutor());
    }

    @Test
    void getISBN() {
        assertEquals(12345, l.getISBN());
    }

    @Test
    void setNome() {
        l.setNome("Homem da Arena");
        assertEquals("Homem da Arena", l.getNome());
    }

    @Test
    void setAutor() {
        l.setAutor("Armando Spiandorello");
        assertEquals("Armando Spiandorello", l.getAutor());
    }

    @Test
    void setISBN() {
        l.setISBN(54321);
        assertEquals(54321, l.getISBN());
    }

    @Test
    void testToString() {
        String s = "Livro{" +
                "nome='" + l.getNome() + '\'' +
                ", autor='" + l.getAutor() + '\'' +
                ", ISBN=" + l.getISBN() +
                '}';
        assertEquals(s, l.toString());
    }
}