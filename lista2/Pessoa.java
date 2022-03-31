public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cep;
    private String cidade;
    private String uf;
    public Pessoa(String nome, String telefone, String endereco, String cidade, String uf, String cep){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setCep(cep);
        this.setCidade(cidade);
        this.setUf(uf);
    }
    public void alterarEndereco(String endereco, String cidade, String uf, String cep){
        this.setEndereco(endereco);
        this.setCep(cep);
        this.setCidade(cidade);
        this.setUf(uf);
    }
    public void alterarTelefone(String telefone){
        this.setTelefone(telefone);
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCep() {
        return cep;
    }
    public String getCidade() {
        return cidade;
    }
    public String getUf() {
        return uf;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    private void setCep(String cep) {
        this.cep = cep;
    }
    private void setCidade(String cidade) {
        this.cidade = cidade;
    }
    private void setUf(String uf) {
        this.uf = uf;
    }
    public String toString(){
        return this.getNome()+" mora no endereço "+this.getEndereco()+" em "+this.getCidade()+" e seu telefone é "+this.getTelefone();
    }
}