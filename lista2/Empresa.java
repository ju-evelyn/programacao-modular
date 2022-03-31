public class Empresa {
    private static final int MAX_CLIENTES = 100;
    private static final int MAX_FUNCIONARIOS = 100;
    private String nomeEmpresa;
    private Pessoa[] clientes;
    private int numClientes;
    private PessoaFisica[] funcionarios;
    private int numFuncionarios;
    private PessoaFisica presidente;
    public Empresa(String nomeEmpresa){
        this.setNomeEmpresa(nomeEmpresa);
        clientes = new Pessoa[MAX_CLIENTES];
        funcionarios = new PessoaFisica[MAX_FUNCIONARIOS];
    }
    public void addCliente(Pessoa cliente) {
        if(this.getNumClientes()<MAX_CLIENTES){
            this.clientes[this.getNumClientes()] = cliente;
            this.setNumClientes();
        }
    }
    public void addFuncionario(PessoaFisica funcionario){
        this.funcionarios[this.getNumFuncionarios()] = funcionario;
        this.setNumFuncionarios();
    }
    public void removeCliente(String nome) {
        for(int i=0;i<this.getNumClientes();i++){
            if(nome.equalsIgnoreCase(this.clientes[i].getNome())){
                for(int j = i+1; j<this.getNumClientes(); j++){
                    this.clientes[j-1]=this.clientes[j];
                }
                this.clientes[this.getNumClientes()] = null;
                this.numClientes--;
            }
        }
    }
    public void removeFuncionario(String nome) {
        for(int i=0;i<this.getNumFuncionarios();i++){
            if(nome.equalsIgnoreCase(this.funcionarios[i].getNome())){
                for(int j = i+1; j<this.getNumFuncionarios(); j++){
                    this.funcionarios[j-1]=this.funcionarios[j];
                }
                this.funcionarios[this.getNumFuncionarios()] = null;
                this.numFuncionarios--;
            }
        }
    }
    private boolean validarPresidente(PessoaFisica presidente){
        for(int i = 0;i<this.getNumFuncionarios();i++){
            if(presidente.equals(this.funcionarios[i])){
                return true;
            }
        }
        return false;
    }
    public String listaDeFuncionarios(){
        String funcionarios = "Funcionários da empresa "+this.getNomeEmpresa()+"/n";
        for(int i = 0;i<this.getNumFuncionarios();i++){
            funcionarios += this.funcionarios[i].toString()+"/n";
        }
        return funcionarios;
    }
    public String listaDeClientes(){
        String clientes = "Clientes da empresa "+this.getNomeEmpresa()+"/n";
        for(int i = 0;i<this.getNumClientes();i++){
            clientes += this.clientes[i].toString()+"/n";
        }
        return clientes;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public Pessoa[] getClientes() {
        return clientes;
    }
    public int getNumClientes() {
        return numClientes;
    }
    public PessoaFisica[] getFuncionarios() {
        return funcionarios;
    }
    public int getNumFuncionarios() {
        return numFuncionarios;
    }
    public PessoaFisica getPresidente() {
        return presidente;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    public void setNumClientes() {
        this.numClientes++;
    }
    public void setNumFuncionarios() {
        this.numFuncionarios++;
    }
    public void setPresidente(PessoaFisica presidente) {
        if(this.validarPresidente(presidente)){
            this.presidente = presidente;
        }
    }
    public String toString(){
        return "A empresa "+this.getNomeEmpresa()+" é presidida por "+this.getPresidente().getNome()+", possui "+this.getNumClientes()+" clientes e "+this.getNumFuncionarios()+" funcionários.";
    }
}