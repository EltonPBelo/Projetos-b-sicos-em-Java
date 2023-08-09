package JogoDeAdivinhacao;
import java.util.Random;
import java.util.Scanner;

public class jogo2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numero; // var que vai armazenar o numero que o user escolheu pra advinhar o num sorteado
    int tentativas;// var que vai armazenar o numeros de tentativas do user que será 10
    int numSorteado;// numero sorteado pelo computado que o user vai tentar advinhar
    int continuar; // var pra saber se o user vai continuar

    do {
        System.out.println("Sorteando um número entre 0 e 100.....");
        Random numeroAleatorio = new Random();
        numSorteado = numeroAleatorio.nextInt(101);   
        
        System.out.println("O jogo começou tente me vencer");
        tentativas = 0;

        

        do{
            tentativas++;
            System.out.printf("Tentativa %d: ",tentativas);
            numero = input.nextInt();

            if (numero > numSorteado) {
                System.out.printf("\nO número sorteado é menor que %d\n\n",numero);

            }else if(numero< numSorteado){
                System.out.printf("\nO número sorteado é maior que %d\n\n",numero);
            }else{
                System.out.printf("parabêns voçê acertou em %d tentativas\n\n", tentativas);
                break;
            }
        
        }while(tentativas != 10);
        System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar:  ");
        continuar = input.nextInt();


    }while(continuar != 0);

    input.close();

    }
    
}
