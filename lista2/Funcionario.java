public class Funcionario {
    private String cargo;
    private double salario;
    public Funcionario(String cargo, double salario) {
        this.setCargo(cargo);
        this.setSalario(salario);
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String toString(){
        return "Cargo: "+this.getCargo()+" | Salário: R$"+String.format("%.2f", this.getSalario());
    }
}