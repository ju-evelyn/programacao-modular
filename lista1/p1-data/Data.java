import java.time.*;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    public static final int ANO_MINIMO = 1;
    public static final int DIA_MINIMO = 1;
    public static final int DIA_MAXIMO = 31;
    public static final int MES_MINIMO = 1;
    public static final int MES_MAXIMO = 12;
    public static final int DIA_MAXIMO_FEVEREIRO = 29;
    public static final int DIA_MAXIMO_ANO = 366;
    public static final String[] DIAS_DA_SEMANA = {"Domingo","Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira", "Sábado"};

    public int getDia() {
        return dia;
    }
    private void setDia(int dia) {
        if(dia>=DIA_MINIMO&&dia<=this.diasNoMes()){
            this.dia = dia;
        }
    }
    public int getMes() {
        return mes;
    }
    private void setMes(int mes) {
        if(mes>=MES_MINIMO&&mes<=MES_MAXIMO){
            this.mes = mes;
        }
    }
    public int getAno() {
        return ano;
    }
    private void setAno(int ano) {
        if(ano>=ANO_MINIMO){
            this.ano = ano;
        }
    }
    public Data(int dia, int mes, int ano) {
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
    }
    public Data() {
        this.setDia(LocalDate.now().getDayOfMonth());
        this.setMes(LocalDate.now().getMonthValue());
        this.setAno(LocalDate.now().getYear());
    }
    public String porExtenso() {
        return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
    }
    public void adicionaDias(int dias) {
        while(dias>=this.diasNoAno()){
            dias -= this.diasNoAno();
            this.ano++;
        }
        while(dias>=this.diasNoMes()){
            dias -= this.diasNoMes();
            this.mes++;
        }
        if(dias>=DIA_MINIMO){
            this.dia+=dias;
            if(this.getDia()>this.diasNoMes()){
                this.dia -= this.diasNoMes();
                this.mes++; 
            }
        }
    }
    public int diasNoMes() {
        switch (this.getMes()) {
            case 4: case 6: case 9: case 11:
                return DIA_MAXIMO-1;
            case 2:
                if(eBissexto()){
                    return DIA_MAXIMO_FEVEREIRO;
                } else {
                    return DIA_MAXIMO_FEVEREIRO-1;
                }
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return DIA_MAXIMO;
        }
        return 0;
    }
    public String diaDaSemana() {
        int dia;
        if(this.getMes()==1||this.getMes()==2){
            dia = (this.dia+(2*(this.mes+12))+((3*((this.mes+12)+1)/5)+(this.ano-1)+((this.ano-1)/4)-((this.ano-1)/100)+((this.ano-1)/400)+1))%7;
        } else {
            dia = (this.dia+(2*this.mes)+((3*(this.mes+1)/5)+this.ano+(this.ano/4)-(this.ano/100)+(this.ano/400)+1))%7;
        }
        return DIAS_DA_SEMANA[dia];
    }
    public boolean eBissexto() {
        if(this.ano % 400 == 0 || (this.ano % 4 == 0) && (this.ano % 100 != 0)){
            return true;
        } else {
            return false;
        }
    }
    public void proximoDia() {
        this.adicionaDias(1);
    }
    private int diasNoAno(){
        if(eBissexto()){
            return DIA_MAXIMO_ANO;
        } else {
            return DIA_MAXIMO_ANO-1;
        }
    }
}