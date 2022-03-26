public class Aplicacao {
    public static void main(String[] args) {
        Data data = new Data(29,8,2021);
        System.out.println("Descrição de tratamento Médico(ilustração)");
        System.out.println("Data de início: "+data.porExtenso());
        System.out.println("Duração: 900 dias");
        data.adicionaDias(900);
        System.out.println("Data final: "+data.porExtenso());
        data.proximoDia();
        System.out.println("Data de retorno ao médico: "+data.diaDaSemana()+", "+data.porExtenso());
        System.out.println("Tempo de observação: até o final do mês.");
        System.out.print("Dias no mês: "+data.diasNoMes());
        if(data.eBissexto()){
            System.out.println(" pois ano é bissexto.");
        } else {
            System.out.println(" pois o ano não é bissexto.");
        }
    }
}