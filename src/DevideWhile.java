import java.util.Scanner;

public class DevideWhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti nr:");
        int numberToBeChecked=scanner.nextInt();
        int x=numberToBeChecked;
        int result=0;
        while (numberToBeChecked%2==0) {
            numberToBeChecked /= 2;
            result++;
        }
            System.out.println("Number " + x + " divide by 2 " + result+" times!");


        }
    }
