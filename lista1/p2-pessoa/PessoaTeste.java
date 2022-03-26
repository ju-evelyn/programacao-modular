import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class PessoaTeste {
    Pessoa pessoa;
    @Test
    public void testeConstrutorPadrao(){
        pessoa = new Pessoa();
        assertEquals("Fulano",pessoa.getNome());
    }
    @Test
    public void testeConstrutorComAtributo(){
        pessoa = new Pessoa("Alguem", 987654321, 25, "Feminino");
        assertEquals(987654321,pessoa.getCpf());
    }
    @Test
    public void testeEMaiorDeIdadeTrue(){
        pessoa = new Pessoa("Ciclano", 876543210, 32, "Masculino");
        assertTrue(pessoa.eMaiorDeIDade());
    }
    @Test
    public void testeEMaiorDeIdadeFalse(){
        pessoa = new Pessoa("Beltrano", 789654321, 16, "Masculino");
        assertFalse(pessoa.eMaiorDeIDade());
    }
}
