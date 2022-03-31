import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ClienteTeste {
    Cliente cliente;
    @Test
    public void testeConstrutor(){
        cliente = new Cliente(5000.0);
        assertEquals("Limite de Crédito: R$5000,00", cliente.toString());
    }
    
}
