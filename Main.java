import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sum(x,y);
    }
    static void sum(int x, int y){
        int z = x+y;
        System.out.println(z);
    }

}
