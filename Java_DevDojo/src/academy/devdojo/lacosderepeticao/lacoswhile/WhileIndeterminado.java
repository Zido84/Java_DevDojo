package academy.devdojo.lacosderepeticao.lacoswhile;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String Palavra = entrada.nextLine();

        while (!Palavra.equalsIgnoreCase("sair")){
            System.out.println("Você disse: " + Palavra);
            System.out.println("Você quiz dizer: ");
            Palavra = entrada.nextLine();
        }
        entrada.close();
    }
}
