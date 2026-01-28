package ex6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        // khai báo biến chiều dài, chiều rộng của hcn
        float width,height;
        // nhập chiều dài và chiều rộng của hcn
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài hcn: ");
        width = sc.nextFloat();
        System.out.print("Nhập chiều rộng hcn: ");
        height = sc.nextFloat();
        sc.close();
        // tính chu vi và diện tích hcn
        float area = width * height;
        float circumference  = (width + height) * 2;
        // in kết quả
        System.out.printf("chiều dài: %.2f, chiều rộng: %.2f%nChu vi: %.2f%nDiện tích: %.2f",width,height,circumference,area);
    }
}
