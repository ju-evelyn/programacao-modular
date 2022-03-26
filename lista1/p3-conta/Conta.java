import java.text.DecimalFormat;
public class Conta {
    private int agencia;
    private String numeroConta;
    private double saldo;
    public static int contador = 0;

    DecimalFormat formatacao = new DecimalFormat("#,##0.00");
    public Conta(){
        this.agencia = (contador/100)+1;
        this.numeroConta = Integer.toString(this.agencia)+Conta.contador;
        this.saldo = 0;
        Conta.contador++;
    }
    public Conta(int saldoInicial){
        this.agencia = (contador/100)+1;
        this.numeroConta = Integer.toString(this.agencia)+Conta.contador;
        this.depositar(saldoInicial);
        Conta.contador++;
    }
    public int getAgencia() {
        return agencia;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    } 
    public static int getContador() {
        return contador;
    }
    public void sacar(int saque){
        this.saldo -= saque;
    }
    public void depositar(int deposito){
        this.saldo += deposito;
    }
    public String imprimirDados(){
        return "Conta: "+this.getNumeroConta()+" Agência: "+this.getAgencia()+" Saldo atual: R$"+formatacao.format(this.getSaldo());
    }
}