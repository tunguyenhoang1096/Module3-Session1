package ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("Diện tích hình tròn có bán kính %.2f là: %.2f",radius,area);
    }
}
