import java.util.Scanner;
public class third_prob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a cost price : ");
        int n = scan.nextInt();

        System.out.print("if you are a student Enter (1) otherwise any number :  ");
        int m = scan.nextInt();

        if(m==1){
            if(n>=500){
                System.out.println("you will get 10% Discount ");
            }
            else {
                System.out.println("you will get 5% Discount ");
            }
        }
        else {
            if(n>=500){
                System.out.println("you will get 8% Discount ");
            }
            else {
                System.out.println("you will get 2% Discount ");
            }
        }

    }
}
