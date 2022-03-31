import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class FuncionarioTeste {
    Funcionario funcionario;
    @Test
    public void testeConstrutor(){
        funcionario = new Funcionario("Motorista", 1200.0);
        assertEquals("Cargo: Motorista | Salário: R$1200,00", funcionario.toString());
    }
}