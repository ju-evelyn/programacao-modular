import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class EmpresaTeste {
    Empresa empresa;
    PessoaFisica funcionario1;
    PessoaFisica funcionario2;
    PessoaFisica funcionario3;
    PessoaFisica cliente1;
    PessoaJuridica cliente2;
    PessoaFisica qualquer;
    @BeforeEach
    public void init(){
        empresa = new Empresa("Empresa Teste");
        funcionario1 = new PessoaFisica("Carlos", "3443-5665", "Rua zero, número 0", "BH", "MG", "31000-200", "Porteiro", 2500);
        funcionario2 = new PessoaFisica("Jose", "3443-5667", "Rua um, número 1", "BH", "MG", "31000-300", "Atendente", 2600);
        funcionario3 = new PessoaFisica("Luana", "3443-5668", "Rua dois, número 2", "BH", "MG", "31000-300", "Presidente", 5000);
        cliente1 = new PessoaFisica("Carminha", "98888-8888", "Rua flor, número 0", "BH", "MG", "31999-300", 30000);
        cliente2 = new PessoaJuridica("Google", "4002-8922", "Avenida andradas, número 3000", "BH", "MG", "31999-300", 300000);
        empresa.addFuncionario(funcionario1);
        empresa.addFuncionario(funcionario2);
        empresa.addFuncionario(funcionario3);
        empresa.addCliente(cliente1);
        empresa.addCliente(cliente2);
    }
    @Test
    public void testeAddCliente(){
        assertEquals("Clientes da empresa Empresa Teste/nCliente: Carminha/nTelefone: 98888-8888/nEndereço: Rua flor, número 0, BH, MG/nLimite de Crédito: R$30000.0/nEmpresa: Google/nTelefone: 4002-8922/nEndereço: Avenida andradas, número 3000, BH, MG/nLimite de Crédito: R$300000.0/n", empresa.listaDeClientes());
    }
    @Test
    public void testeAddFuncionario(){
        assertEquals("Funcionários da empresa Empresa Teste/nFuncionário: Carlos/nTelefone: 3443-5665/nEndereço: Rua zero, número 0, BH, MG/nCargo: Porteiro/nSalário: R$2500.0/nFuncionário: Jose/nTelefone: 3443-5667/nEndereço: Rua um, número 1, BH, MG/nCargo: Atendente/nSalário: R$2600.0/nFuncionário: Luana/nTelefone: 3443-5668/nEndereço: Rua dois, número 2, BH, MG/nCargo: Presidente/nSalário: R$5000.0/n", empresa.listaDeFuncionarios());
    }
    @Test
    public void testeRemoveCliente(){
        empresa.removeCliente("Carminha");
        assertEquals("Clientes da empresa Empresa Teste/nEmpresa: Google/nTelefone: 4002-8922/nEndereço: Avenida andradas, número 3000, BH, MG/nLimite de Crédito: R$300000.0/n", empresa.listaDeClientes());
    }
    @Test
    public void testeRemoveFuncionario(){
        empresa.removeFuncionario("Jose");
        assertEquals("Funcionários da empresa Empresa Teste/nFuncionário: Carlos/nTelefone: 3443-5665/nEndereço: Rua zero, número 0, BH, MG/nCargo: Porteiro/nSalário: R$2500.0/nFuncionário: Luana/nTelefone: 3443-5668/nEndereço: Rua dois, número 2, BH, MG/nCargo: Presidente/nSalário: R$5000.0/n", empresa.listaDeFuncionarios());
    }
    @Test
    public void testevalidarPresidente(){
        empresa.setPresidente(funcionario3);
        assertEquals(funcionario3, empresa.getPresidente());
    }
    @Test
    public void testevalidarPresidenteErrado(){
        qualquer = new PessoaFisica("Lucia", "3443-5000", "Rua mil, número 465", "BH", "MG", "31000-200", " ", 0);
        empresa.setPresidente(qualquer);
        assertEquals(null, empresa.getPresidente());
    }
}