import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh 1: ");
        double canh1 = sc.nextDouble();
        System.out.println("Nhap do dai canh 2: ");
        double canh2 = sc.nextDouble();
        System.out.println("Nhap do dai canh 3: ");
        double canh3 = sc.nextDouble();


        TriangleException tr = new TriangleException(canh1, canh2, canh3);
        System.out.println("tam giac ok");


    }
}
