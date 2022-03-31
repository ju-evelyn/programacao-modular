public class PessoaFisica extends Pessoa {
    private Cliente cliente;
    private Funcionario funcionario;
    public PessoaFisica(String nome, String telefone, String endereco, String cidade, String uf, String cep, double limiteDeCredito) {
        super(nome, telefone, endereco, cidade, uf, cep);
        cliente = new Cliente(limiteDeCredito);
    }
    public PessoaFisica(String nome, String telefone, String endereco, String cidade, String uf, String cep, String cargo, double salario) {
        super(nome, telefone, endereco, cidade, uf, cep);
        funcionario = new Funcionario(cargo, salario);
    }
    @Override
    public String toString(){
        if(cliente!=null){
            return "Cliente: "+this.getNome()+"/nTelefone: "+this.getTelefone()+"/nEndereço: "+this.getEndereco()+", "+this.getCidade()+", "+this.getUf()+"/nLimite de Crédito: R$"+cliente.getLimiteDeCredito();
        } else {
            return "Funcionário: "+this.getNome()+"/nTelefone: "+this.getTelefone()+"/nEndereço: "+this.getEndereco()+", "+this.getCidade()+", "+this.getUf()+"/nCargo: "+funcionario.getCargo()+"/nSalário: R$"+funcionario.getSalario();
        }
    }
}