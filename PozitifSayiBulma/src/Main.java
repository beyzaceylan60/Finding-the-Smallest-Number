import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayi=0;
        int enkucuk=0;
        int bool=1;
        System.out.println("Enter a Positive Number: ");
        enkucuk = klavye.nextInt();
        System.out.println("Do You Want To Continue?");
        System.out.println("If your answer is yes, enter 1, if no, enter 0: ");
        bool = klavye.nextInt();
        while(bool==1){
            System.out.println("Enter a Positive Number : ");
            sayi = klavye.nextInt();
            System.out.println("Do You Want To Continue?");
            System.out.println("If your answer is yes, enter 1, if no, enter 0: ");
            bool = klavye.nextInt();
            if(enkucuk>sayi){
                enkucuk=sayi;
            }
        }
        System.out.println("Smallest number entered: "+enkucuk);
    }
}

