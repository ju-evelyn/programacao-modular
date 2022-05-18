public class Humano {
    public String nome;
    public Humano(String nome){
        this.nome=nome;
    }
    @Override
    public String toString(){
        return this.nome;
    }
}