import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ContaTeste {
    Conta banco;
    @BeforeEach
    public void init(){
        banco = new Conta(500);
    }
    @Test
    public void testeConstrutorNumeroConta(){
        //primeiro o número da agência e depois o contador
        System.out.println(banco.getAgencia());
        System.out.println(Conta.getContador());
        assertEquals("10", banco.getNumeroConta());
    }
    @Test
    @DisplayName("Teste para saber se o número das contas está alterando conforme outras são criadas")
    public void testeConstrutorNumeroConta2(){
        Conta banco2 = new Conta();
        //primeiro o número da agência e depois o contador
        System.out.println(Conta.getContador());
        System.out.println(banco.getAgencia());
        assertEquals("11", banco2.getNumeroConta());
    }
    @Test
    public void testeMetodoSacar(){
        banco.sacar(50);
        assertEquals(450, banco.getSaldo());
    }
    @Test
    public void testeMetodoDepositar(){
        banco.depositar(50);
        assertEquals(550, banco.getSaldo());
    }
    @Test
    public void testeMetodoImprimirDados(){
        assertEquals("Conta: 10 Agência: 1 Saldo atual: R$500,00", banco.imprimirDados());
    }
}
