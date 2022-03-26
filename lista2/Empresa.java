public class Empresa {
    public Pessoa[] Clientes;
    public PessoaFisica[] funcionarios;
    public PessoaFisica presidente;
    public Pessoa[] getClientes() {
        return Clientes;
    }
    public PessoaFisica[] getFuncionarios() {
        return funcionarios;
    }
    public PessoaFisica getPresidente() {
        return presidente;
    }
    public void setPresidente(PessoaFisica presidente) {
        this.presidente = presidente;
    }
}
