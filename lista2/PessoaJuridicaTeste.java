import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class PessoaJuridicaTeste {
    Pessoa empresa;
    @BeforeEach
    public void init(){
        empresa = new PessoaJuridica("Fachada", "+55(31)3456-7890", "Rua Qualquer, número 20", "Horizonte Belo", "MG", "31555-500", 50000);
    }
    @Test
    public void testeConstrutorPessoaJuridica(){
        assertEquals("Empresa: Fachada/nTelefone: +55(31)3456-7890/nEndereço: Rua Qualquer, número 20, Horizonte Belo, MG/nLimite de Crédito: R$50000.0", empresa.toString());
    }
    @Test
    public void testeAlterarEndereco(){
        empresa.alterarEndereco("Rua nova, número 200", "Belo Horizonte", "MG", "31678-900");
        assertEquals("Empresa: Fachada/nTelefone: +55(31)3456-7890/nEndereço: Rua nova, número 200, Belo Horizonte, MG/nLimite de Crédito: R$50000.0", empresa.toString());
    }
    @Test
    public void testeAlterarTelefone(){
        empresa.alterarTelefone("+55(31)98765-4321");
        assertEquals("Empresa: Fachada/nTelefone: +55(31)98765-4321/nEndereço: Rua Qualquer, número 20, Horizonte Belo, MG/nLimite de Crédito: R$50000.0", empresa.toString());
    }
}