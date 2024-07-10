import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figura = sc.nextLine();
        int a = sc.nextInt();
        perimetr(figura,a);
        area(figura,a);

    }
    static void perimetr(String square,int a){
        String lowerCase = square.toLowerCase();
        if (lowerCase.equals("квадрат")){
            System.out.println(a*4);
            System.out.println(a*a);
        }

    }
    static void area(String circle,int r){
        String lowerCase = circle.toLowerCase();
        if (lowerCase.equals("круг")){
            System.out.println(Math.round((Math.round(2*Math.PI*r))));
            System.out.println(Math.round(Math.ceil(Math.PI*(r*r))));
        }

    }

}
