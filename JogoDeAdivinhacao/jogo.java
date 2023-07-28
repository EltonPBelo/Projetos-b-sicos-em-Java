package JogoDeAdivinhacao;
import java.util.Scanner;
import java.util.Random;

public class jogo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //função pra coletar dados do usuario  
        System.out.print("Tenta adivinhar o número que eu tou pensando de 1 até 5: "); 
        int seunumero = input.nextInt();

        Random aleatorio = new Random();// função random tipo o scanner
        int valoraleatorio = aleatorio.nextInt(5)+1;//o computador vai escolher um número aleatorio do (10) incluindo o 1 
        //que nesso caso é representado por um + (do valor ?) até o +?
        //se o jogador digitar um valor menor que 1 ou maior que 5, inicia o laço até que seja digitado um valor válido
        while (seunumero>5||seunumero<1) {
           System.out.print("Tenta adivinhar o número que eu tou pensando de 1 até 5: "); 
           seunumero = input.nextInt();
        }
        //se o jogador primeira vai exibir essa mensagem
        if(seunumero==valoraleatorio){
            System.out.println("Parabens voçê acertou o número que eu tou pensando!");
        }
        // se ele errar essa mensagem será exibida
        else{
            System.out.printf("Eita você errou!  Eu pensei no %d ",valoraleatorio);
            
            //bloco para outra tentativa
            System.out.println("Deseja tentar denovo?");
            System.out.print("Sim = 1\nNão = 2");
            System.out.println("\nSua resposta: ");
            int again = input.nextInt();

            //bloco pra conferir se o usuario quer ir novamente ou sair do jogo, se ele digitar um valor inválido inicia o laço
            while (again != 1 && again != 2) {
                System.out.println("Deseja tentar denovo?");
                System.out.print("Sim = 1\nNão = 2\n");
                System.out.println();
                System.out.println("Sua resposta: ");
                again = input.nextInt();}
               
            //se again for igual a 1 
            if(again==1){
                System.out.println("Tenta adivinhar o número que eu estou pensando de 1 a 5: ");
                seunumero = input.nextInt();
                 aleatorio = new Random();// função random tipo o scanner, que nesse caso eu precisei tirar o random do nome pois ele ja está definido (mesma lógiga das variaveis)
                 valoraleatorio = aleatorio.nextInt(5)+1;

                 //Enquando o jogador não adivinhar o mesmo número que a maquina, inicia um laço pra ele tentar de novo até acertar, pois dentro desse while está o if(seunumero==valoraleatorio) que vai possibilitar esse acontecimento, juntamente com o else caso o jogador queira sair
                while(seunumero!=valoraleatorio){
                    System.out.println("Deseja tentar denovo?");
                    System.out.print("Sim = 1\nNão = 2\n");
                    System.out.println("Sua resposta: ");
                    again = input.nextInt();
                
                 //bloco da pergunta
                System.out.println("Tenta adivinhar o número que eu estou pensando de 1 a 5: ");
                seunumero = input.nextInt();
                aleatorio = new Random();// função random tipo o scanner, que nesse caso eu precisei tirar o random do nome pois ele ja está definido (mesma lógiga das variaveis)
                valoraleatorio = aleatorio.nextInt(5)+1;
                }
                    // se a maquina e o jogador pensarem iguais vai exibir essa mensagem
                    if(seunumero==valoraleatorio){
                    System.out.println("Parabens voçê acertou o número que eu tou pensando!");
                }
                }
                 
            //Se não quiser jogar mais e apertar o número 2 
            else if(again==2){
                
                System.out.println("Encerrando......\nPrograma encerrado\nHasta la vista");
            }              
            }
            input.close();//Scanner input pra coletar dados fornecido pelo jogador encerrado
        }      
}