public class Pessoa {
    private String nome;
    private int cpf;
    private int idade;
    private String sexo;
    public static final int MAIORIDADE = 18;

    public Pessoa(){
        this.nome = "Fulano";
        this.cpf = 1234567890;
        this.idade = 18;
        this.sexo = "Masculino";
    }
    public Pessoa(String nome, int cpf, int idade, String sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public boolean eMaiorDeIDade() {
        if(this.getIdade()>=MAIORIDADE){
            return true;
        } else {
            return false;
        }
    }
}
