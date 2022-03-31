public class PessoaJuridica extends Pessoa {
    private Cliente cliente;
    public PessoaJuridica(String nome, String telefone, String endereco, String cidade, String uf, String cep, double limiteDeCredito) {
        super(nome, telefone, endereco, cidade, uf, cep);
        cliente = new Cliente(limiteDeCredito);
    }
    @Override
    public String toString() {
        return "Empresa: "+this.getNome()+"/nTelefone: "+this.getTelefone()+"/nEndereço: "+this.getEndereco()+", "+this.getCidade()+", "+this.getUf()+"/nLimite de Crédito: R$"+cliente.getLimiteDeCredito();
    }
}