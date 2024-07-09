import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sOne = sc.next();
        sc.next();
        String sTy = sc.next();
        twoWords(sOne,sTy);

    }
    static void twoWords(String s1, String s2){
        if (s1.length() > s2.length()){
            System.out.println("Первая строка");
        }else if (s2.length() > s1.length()){
            System.out.println("Вторая строка");
        }else {
            System.out.println("Строки равны");
        }

    }

}
