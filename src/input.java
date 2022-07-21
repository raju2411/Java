import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //take a number input from a user and print the each number starting from 0;

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number  = sc.nextInt();

        for(int i=1;i<=number;i++){
            System.out.print(i+" ");
        }
    }
}
