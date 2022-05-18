import java.util.Random;
public class App {
    public static void main(String[] args){
        Random rand  = new Random();
        Data[] listaDatas = new Data[4];
        for(int i = 0; i<4; i++){
            listaDatas[i] = new Data(rand.nextInt(29)+1, rand.nextInt(11)+1, rand.nextInt(1022)+1000);
            //+1 para não dar zero e +1000 para melhor legibilidade
        }
        for (Data data : listaDatas) {
            System.out.println(data.getDia()+"/"+data.getMes()+"/"+data.getAno()+"\n");
        }
        Data[] listaCrescente = (Data[]) Ordenador.crescente(listaDatas);
        System.out.println("============================================================");
        for (Data data : listaCrescente) {
            System.out.println(data.getDia()+"/"+data.getMes()+"/"+data.getAno()+"\n");
        }
        Data[] listaDescrescente = (Data[]) Ordenador.decrescente(listaDatas);
        System.out.println("============================================================");
        for (Data data : listaDescrescente) {
            System.out.println(data.getDia()+"/"+data.getMes()+"/"+data.getAno()+"\n");
        }
    }
}
