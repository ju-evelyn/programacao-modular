public abstract class Pessoa {
    public String nome;
    public String endereco;
    public String telefone;
    public String cep;
    public String cidade;
    public String uf;
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
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String toString(){
        return this.getNome()+" mora no endereço "+this.getEndereco()+" em "+this.getCidade()+" e seu telefone é "+this.getTelefone();
    }
}
