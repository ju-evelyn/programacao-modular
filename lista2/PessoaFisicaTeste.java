import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
public class PessoaFisicaTeste {
    PessoaFisica pessoa;
    @Test
    public void testeConstrutorCliente(){
        pessoa = new PessoaFisica("Joao","(31)91234-5678","Rua dos Bobos, número 0", "Belo Horizonte", "MG", "31555-500", 5000);
        assertEquals("Cliente: Joao/nTelefone: (31)91234-5678/nEndereço: Rua dos Bobos, número 0, Belo Horizonte, MG/nLimite de Crédito: R$5000.0", pessoa.toString());
    }
    @Test
    public void testeConstrutorFuncionario(){
        pessoa = new PessoaFisica("Joao","(31)91234-5678","Rua dos Bobos, número 0", "Belo Horizonte", "MG", "31555-500", "Secretário", 2500);
        assertEquals("Funcionário: Joao/nTelefone: (31)91234-5678/nEndereço: Rua dos Bobos, número 0, Belo Horizonte, MG/nCargo: Secretário/nSalário: R$2500.0", pessoa.toString());
    }
    @Test
    public void testeAlterarEndereco(){
        pessoa = new PessoaFisica("Joao","(31)91234-5678","Rua dos Bobos, número 0", "Belo Horizonte", "MG", "31555-500", 5000);
        pessoa.alterarEndereco("Rua nova, número 200", "Belo Horizonte", "MG", "31678-900");
        assertEquals("Cliente: Joao/nTelefone: (31)91234-5678/nEndereço: Rua nova, número 200, Belo Horizonte, MG/nLimite de Crédito: R$5000.0", pessoa.toString());
    }
    @Test
    public void testeAlterarTelefone(){
        pessoa = new PessoaFisica("Joao","(31)91234-5678","Rua dos Bobos, número 0", "Belo Horizonte", "MG", "31555-500", 5000);
        pessoa.alterarTelefone("(31)98765-4321");
        assertEquals("Cliente: Joao/nTelefone: (31)98765-4321/nEndereço: Rua dos Bobos, número 0, Belo Horizonte, MG/nLimite de Crédito: R$5000.0", pessoa.toString());
    }
}