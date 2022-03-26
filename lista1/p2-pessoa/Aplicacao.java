import java.util.Scanner;
public class Aplicacao {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cadastro de Pessoa");
        System.out.println("Por favor, insira o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Por favor, insira o seu cpf(8 dígitos):");
        int cpf = entrada.nextInt();
        System.out.println("Por favor, insira sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Por favor insira seu sexo:");
        String sexo = entrada.nextLine();
        
        System.out.println("cadastrando "+nome+"...");
        Pessoa cadastrada = new Pessoa(nome, cpf, idade, sexo);
        System.out.println("========================");
        System.out.println("Dados cadastrados:");
        System.out.println("nome: "+cadastrada.getNome());
        System.out.println("cpf: "+cadastrada.getCpf());
        System.out.println("idade: "+cadastrada.getIdade());
        System.out.println("sexo: "+cadastrada.getSexo());
        String deMaior;
        if(cadastrada.eMaiorDeIDade()){
            deMaior = "sim";
        } else {
            deMaior = "não";
        }
        System.out.println("Maior de idade: "+deMaior);
        System.out.println("========================");
        entrada.close();
    }
}
