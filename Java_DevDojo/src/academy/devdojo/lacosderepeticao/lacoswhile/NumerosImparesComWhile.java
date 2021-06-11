package academy.devdojo.lacosderepeticao.lacoswhile;

import java.util.Scanner;

public class NumerosImparesComWhile {
    public static void main(String[] args) {

        System.out.println("Digite um numero: ");

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int i = 0;

        while (i <= numero){
            if (i % 2 != 0){
                System.out.println("i = " + i);
            }
            i ++;
        }
        entrada.close();
    }
}
