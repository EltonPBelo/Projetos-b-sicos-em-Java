import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            
            if(jogada %2 == 1){
                System.out.println("Vez do jogador 1. Escolha linha e coluna que vai do (1 Ao 3)");
                sinal = 'x';
            }
            else{
                System.out.println("Vez do jogador 2. Escolha linha e coluna que vai do (1 Ao 3)");
                sinal = 'O';
            }
            //continuação da lógica
            boolean linhaValida = false;
            while(!linhaValida){
                System.out.println("Entre com a linha válida (1,2 ou 3)");
                linha  = entrada.nextInt();
                if(linha > 0 && linha <= 3){
                    linhaValida = true;
                }
                else{
                    System.out.println("Ops, um valor inválido foi digitado. Tente novamente!");
                }
            }
            
            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna válida (1,2 ou 3)");
                coluna = entrada.nextInt();
                if (coluna > 0 && coluna <=3) {
                    colunaValida = true;
                }
                else{
                    System.out.println("Ops, um valor inválido foi digitado. Tente novamente!");
                }

                linha--;// o jogador vai digitar um valor entre 1 e 3 
                coluna--;// mas aqui no desenvolvimento vamos usar valor entre  e 2

                //Verificando se o campo está preenchido, para não repetir ou sobresair jogadas
                if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                    System.out.println("Posição já usada tente novamente");
                }
                else{//jogada válida
                    tabuleiro[linha][coluna] = sinal;
                    jogada++;
                }

                for(int i = 0 ; i < tabuleiro.length; i++){
                    for(int j = 0; j< tabuleiro[i].length; j++){
                        System.out.print(tabuleiro[i][j]+" | ");
                    }
                    System.out.println(); //quando a linha for trocada
                }

                //verificar se tem ganhador
                if((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X')||//Linha 1
                (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X')||//Linha 2
                (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X')||//Linha 3
                (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X')||//Coluna 1
                (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X')||//Coluna 2
                (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X')||//coluna 3
                (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X'))//diagonal
                {
                    ganhou = true;
                    System.out.println(" O jogador X ganhou com "+jogada+" jogadas");
                }
                else if((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X')||//Linha 1
                (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O')||//Linha 2
                (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O')||//Linha 3
                (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O')||//Coluna 1
                (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O')||//Coluna 2
                (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O')||//coluna 3
                (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O'))//diagonal
                {
                    ganhou = true;
                    System.out.println(" O jogador O ganhou com "+jogada+" jogadas");
                }
                else if (jogada>9){
                    ganhou = true;
                    System.out.println("DEU VELHA");
                }


                    
                
 
            }


        }

entrada.close();

    }
}
