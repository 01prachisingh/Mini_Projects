import java.util.*;
public class rockpaperscissorgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player1score = 0;
        int player2score = 0;

      for(int i =1;i<=5;i++){
        System.out.println("Round = " + i);

        System.out.println("Player 1 choice = " );
        int player1 = sc.nextInt();

        System.out.println("Player 2 choice = ");
        int player2 = sc.nextInt();

         if(player1 == player2){
            System.out.println("Its a draw");
         }
         else if(( player1 == 1 && player2 == 2) ||
         (player1 == 2 && player2 ==3) ||
         (player1 == 3 && player2 == 1)){
            System.out.println("player1 win this round");
            player1score++;
         }
         else{
            System.out.println("player2 win this round");
            player2score++;
         }
       
            
        }
        System.out.println("Total points of player 1 = " + player1score);
        System.out.println("Total points of player 2 = " + player2score);

        if(player1score > player2score){
            System.out.println("player 1 won");
        }
        else{
            System.out.println("player 2 won");
        }
        sc.close();
    }
    
}
