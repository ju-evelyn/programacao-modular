public class PessoaFisica extends Pessoa {
    private String cargo;
    private float salario;
    private float limiteDeCredito;
    public String getCargo() {
        return cargo;
    }
    public float getSalario() {
        return salario;
    }
    public float getLimiteDeCredito() {
        return limiteDeCredito;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setLimiteDeCredito(float limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
    public PessoaFisica(String nome, String telefone, String endereco, String cidade, String uf, String cep, float limiteDeCredito) {
        super(nome, telefone, endereco, cidade, uf, cep);
        this.setLimiteDeCredito(limiteDeCredito);
    }
    public PessoaFisica(String nome, String telefone, String endereco, String cidade, String uf, String cep, String cargo, float salario) {
        super(nome, telefone, endereco, cidade, uf, cep);
        this.setCargo(cargo);
        this.setSalario(salario);
    }
    @Override
    public String toString(){
        if(limiteDeCredito>0){
            return "Cliente: "+this.getNome()+"/nTelefone: "+this.getTelefone()+"/nEndereço: "+this.getEndereco()+", "+this.getCidade()+", "+this.getUf()+"/nLimite de Crédito: R$"+this.getLimiteDeCredito();
        } else {
            return "Funcionário: "+this.getNome()+"/nTelefone: "+this.getTelefone()+"/nEndereço: "+this.getEndereco()+", "+this.getCidade()+", "+this.getUf()+"/nCargo: "+this.getCargo()+"/nSalário: R$"+this.getSalario();
        }
    }
}