import java.util.Scanner;
public class first_prob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int n= scan.nextInt();

        if(n%2==0){
            System.out.print("the number is Even ");
        }
        else {
            System.out.println("the number is Odd ");
        }

    }
}
