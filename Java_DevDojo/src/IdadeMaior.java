import java.util.Scanner;

public class IdadeMaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if(idade >= 18){
            System.out.println("Adulto");
        }else if (idade < 18 && idade > 11){
            System.out.println("Adolescente");
        }else if(idade >= 0 && idade <=11){
            System.out.println("Criança");
        }
        entrada.close();
    }
}
