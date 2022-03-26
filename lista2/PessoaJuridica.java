public class PessoaJuridica extends Pessoa {
    private float limiteDeCredito;
    public float getLimiteDeCredito() {
        return limiteDeCredito;
    }
    public void setLimiteDeCredito(float limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
    public PessoaJuridica(String nome, String telefone, String endereco, String cidade, String uf, String cep, float limiteDeCredito) {
        super(nome, telefone, endereco, cidade, uf, cep);
        this.setLimiteDeCredito(limiteDeCredito);
    }
}