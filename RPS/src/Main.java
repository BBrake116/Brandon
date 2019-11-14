import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int userChoice;
        int computerChoice = (int)(Math.random()*3) + 1;

        System.out.println("What do you choose?");

        userChoice = scan.nextInt();


        if(userChoice == 1 && computerChoice == 1){
            System.out.println("You chose rock Computer Chose Rock");
            System.out.println("Its a tie");
        }
        else if(userChoice == 1 && computerChoice == 2){
            System.out.println("You chose Rock Computer chose Paper");
            System.out.println("Paper beats Rock you lose");
        }
        else if(userChoice == 1 && computerChoice == 3){
            System.out.println("You chose Rock Computer chose Scissors");
            System.out.println("Rock beats Scissors you win");
        }
        else if(userChoice == 2 && computerChoice == 1){
            System.out.println("You chose Paper Computer chose Rock");
            System.out.println("Paper beats Rock you win");
        }
        else if(userChoice == 2 && computerChoice == 2){
            System.out.println("You chose Paper Computer chose Paper");
            System.out.println("Its a tie");
        }
        else if(userChoice == 2 && computerChoice == 3){
            System.out.println("You chose Paper Computer chose Scissors");
            System.out.println("Scissors beats paper you lose");
        }
        else if(userChoice == 3 && computerChoice == 1){
            System.out.println("You chose Scissors Computer chose Rock");
            System.out.println("Rock beats scissors you lose");
        }
        else if(userChoice == 3 && computerChoice == 2){
            System.out.println("You chose Scissors Computer chose Paper");
            System.out.println("Scissors beats paper you win");
        }
        else if(userChoice == 3 && computerChoice == 3){
            System.out.println("You chose Scissors Computer chose Scissors");
            System.out.println("Its a tie");
        }

    }
}
