package ParOuImpar;

import java.util.Random;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random choicepc = new Random();
        int valorpc = choicepc.nextInt(100)+1;

        System.out.println("Seja bem vindo(a) ao jogo de impar ou par com a maquina");
        System.out.print("Digite Ímpar para ser ímpar no jogo ou Par para ser par no jogo: ");
        String escolha = input.nextLine();


//O operador || (OU) não pode ser usado diretamente com valores dentro do método equalsIgnoreCase(), pois esse método espera uma String como argumento.
// Em Java, você precisa usar o operador || separadamente e comparar cada uma das condições individualmente.
        while(!escolha.equalsIgnoreCase("par") && !escolha.equalsIgnoreCase("impar") && !escolha.equalsIgnoreCase("-1") )
        {
            System.out.print("Tente novamente\nDigite Ímpar para ser ímpar no jogo ou Par para ser par no jogo ou -1 pra sair do jogo: ");
            escolha = input.nextLine();
        }

        if(escolha.equalsIgnoreCase("par")){
            System.out.print("Digite um número: ");
            int num = input.nextInt();
            System.out.printf("A maquina pensou no número %d\n",valorpc);
            System.out.println("Calculando o resultado.........");

            int resultado = valorpc+num;
            if(resultado%2==0){
                System.out.printf("Você ganhou parabêns o número %d é par",resultado);
            }
            else{
                System.out.printf("Você perdeu o número %d é ímpar",resultado);
            }


        }

        else{
            if(escolha.equalsIgnoreCase("impar")){
            System.out.print("Digite um número: ");
            int num = input.nextInt();
            System.out.printf("A maquina pensou no número %d\n",valorpc);
            System.out.println("Calculando o resultado.........");

            int resultado = valorpc+num;
            if(resultado%2 != 0){
            System.out.printf("Você ganhou parabêns o número %d é ímpar",resultado);
            }
            else{
                System.out.printf("Você perdeu o número %d é par",resultado);
            }
            }
            
        }
        
        if(escolha.equalsIgnoreCase("-1")){
        System.out.println("Programa encerrado");
        }

        input.close();
    }
    
}
