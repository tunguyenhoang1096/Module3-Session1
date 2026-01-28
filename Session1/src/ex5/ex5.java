package ex5;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // khai báo biến tử số và mẫu số
        int numerator1;
        int denominator1;
        int numerator2;
        int denominator2;
        // nhập tử số và mẫu số của 2 phân số
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số của phân số thứ nhất: ");
        numerator1 = sc.nextInt();
        System.out.print("Nhập mẫu số của phân số thứ nhất: ");
        denominator1 = sc.nextInt();
        System.out.print("Nhập tử số của phân số thứ hai: ");
        numerator2 = sc.nextInt();
        System.out.print("Nhập mẫu số của phân số thứ hai: ");
        denominator2 = sc.nextInt();
        sc.close();
        // tính tổng của phân số
        int sumNum = numerator1*denominator2 + denominator1*numerator2;
        int sumDen = denominator1 * denominator2;
        // in kết quả
        System.out.printf("Tổng của ps1 và ps2 %d/%d + %d/%d = %d/%d",numerator1,denominator1,numerator2,denominator2,sumNum,sumDen);
    }
}
