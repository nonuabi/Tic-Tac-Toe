import java.util.Scanner;
import javax.sound.midi.SysexMessage;
import java.util.concurrent.ThreadLocalRandom;
public class Main {

    public static void main(String[] args) {
	// write your code here
        char [] pos={' ', ' ',' ',' ',' ',' ',' ',' ',' '};
        Scanner scanner= new Scanner(System.in);
        int input;
        char turn ='x';
        int turn_count=1;
        while (true) {
            do {
                System.out.print("Enter position : ");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'x' || pos[input - 1] == 'o');

            pos[input - 1] = turn;

            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");

            if(pos[0]==turn && pos[1]==turn && pos[2]== turn
                    ||pos[3]==turn && pos[4]==turn && pos[5]== turn
                    ||pos[6]==turn && pos[7]==turn && pos[8]== turn
                    ||pos[0]==turn && pos[3]==turn && pos[6]== turn
                    ||pos[1]==turn && pos[4]==turn && pos[7]== turn
                    ||pos[2]==turn && pos[5]==turn && pos[8]== turn
                    ||pos[0]==turn && pos[4]==turn && pos[8]== turn
                    ||pos[2]==turn && pos[4]==turn && pos[6]== turn
            )
            {
                System.out.println(turn+" WINNER WINNER CHICKEN DINNER");
                break;
            }
            turn_count++;
            if(turn_count>9)
            {
                System.out.println(" DRAW! ");
                break;
            }
            if (turn == 'x') {
                turn = 'o';
            } else if (turn == 'o') {
                turn = 'x';
            }
        }
    }
}
