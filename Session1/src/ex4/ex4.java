package ex4;

public class ex4 {
    public static void main(String[] args) {
        // khởi tạo 2 biến số nguyên bất kỳ
        int a = 8;
        int b = 5;
        // tổng a + b
        int sum = a + b;
        // hiệu a - b
        int difference = a - b;
        // tích a*b
        int product = a * b;
        // thương a/b
        double quotient = (double) a / b;
        // chia lấy dư a cho b
        int remainder = a % b;
        // in kết quả ra màn hình
        System.out.printf("Tổng của %d và %d là: %d%n",a,b,sum);
        System.out.printf("Hiệu của %d và %d là: %d%n",a,b,difference);
        System.out.printf("Tích của %d và %d là: %d%n",a,b,product);
        System.out.printf("Thương của %d và %d là: %.2f%n",a,b,quotient);
        System.out.printf("Phép chia lấy dư của %d và %d là: %d",a,b,remainder);
    }
}
