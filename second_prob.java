import java.util.Scanner;
public class second_prob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int n = scan.nextInt();
        if(n>=18){
            System.out.println("you are eligible for voting ");
        }
        else {
            System.out.println("Sorry you are not eligible for voting ");
        }

    }
}
