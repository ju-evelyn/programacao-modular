public class Cliente {
    private double limiteDeCredito;
    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }
    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
    public Cliente(double limiteDeCredito){
        this.setLimiteDeCredito(limiteDeCredito);
    }
    public String toString(){
        return "Limite de Crédito: R$"+String.format("%.2f", this.getLimiteDeCredito());
    }
}