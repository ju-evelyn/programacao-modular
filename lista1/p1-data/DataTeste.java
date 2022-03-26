import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DataTeste{
    Data data;
    @BeforeEach
    public void init(){
        data = new Data(01,01,2022);
    }
    @Test
    public void testePorExtenso(){
        assertEquals("1/1/2022", data.porExtenso());
    }
    @Test
    public void testeAdicionaDias(){
        data.adicionaDias(30);
        assertEquals("31/1/2022", data.porExtenso());
    }
    @Test
    public void testeAdicionaDiasComMeses(){
        data.adicionaDias(62);
        assertEquals("4/3/2022", data.porExtenso());
    }
    @Test
    public void testeAdicionaDiasComAnos(){
        data.adicionaDias(852);
        assertEquals("2/5/2024", data.porExtenso());
    }
    @Test
    public void testeDiasNoMes(){
        assertEquals(31, data.diasNoMes());
    }
    @Test
    public void testeDiaDaSemana(){
        assertEquals("Sábado", data.diaDaSemana());
    }
    @Test
    public void testeAnoBissexto(){
        assertFalse(data.eBissexto());
    }
    @Test
    public void testeProximoDia(){
        data.proximoDia();
        assertEquals("2/1/2022",data.porExtenso());
    } 
}