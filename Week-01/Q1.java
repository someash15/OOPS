import java.util.Scanner;

class Oddreven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println((n & 1) == 0 ? 1 : 2);
    }
}