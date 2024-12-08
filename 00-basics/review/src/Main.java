import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myLesson = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Insert 1-15 when choose lesson:");

        int lesson = myLesson.nextInt();
        switch (lesson) {
            case 1:
                System.out.println("Tính toán học hai số nguyên");
                System.out.println("Enter x:");
                int x = input.nextInt();
                System.out.println("Enter y:");
                int y = input.nextInt();

                System.out.println("x + y = " + (x + y));
                System.out.println("x - y = " + (x - y));
                System.out.println("x * y = " + (x * y));
                System.out.println("x / y = " + (x / y));
                System.out.println("x * y = " + (x % y));
                break;
            case 2:
                System.out.println("Kiểm tra số chẵn, số lẻ");
                System.out.println("Enter x:");
                int z = input.nextInt();

                if (z % 2 == 0) {
                    System.out.println("Even number is z = " + z);
                } else {
                    System.out.println("Odd number is z = " + z);
                }
                break;
            case 3:
                System.out.println("Tính diện tích và chu vi hình tròn");
                System.out.println("Enter R:");

                float g = input.nextFloat();

                float area, radius;
                final float PI = 3.14f;
                area = (float)(PI * Math.sqrt(g));
                radius = (float)(2 * PI * Math.sqrt(g));

                System.out.println("Area = " + area);
                System.out.println("Radius = " + radius);
                break;
            case 4:
                System.out.println("Kiểm tra số nguyên tố");
                System.out.println("Enter N:");

                int n = input.nextInt();

                if (n < 2) {
                    System.out.println("N = " + n + "không phải là số nguyên tố");
                }

                for (int i = 2; i <= n/2; i++) {
                    if (n % i == 0) {
                        System.out.println("N = " + n + " không phải là số nguyên tố");
                        return;
                    }
                }

                System.out.println("N = " + n + " là số nguyên tố");
                break;
            case 5:
                System.out.println("Phân loại điểm số");
                System.out.println("Nhập điểm số từ người dùng (0-100):");

                int m = input.nextInt();

                if (m >= 90) {
                    System.out.println("A");
                    return;
                } else if (m >= 80) {
                    System.out.println("B");
                    return;
                } else if (m >= 70) {
                    System.out.println("C");
                    return;
                } else if (m >= 50) {
                    System.out.println("D");
                    return;
                } else {
                    System.out.println("F");
                }

                break;
            case 6:
                System.out.println("Máy tính đơn giản");

                System.out.println("Nhập số A");
                int a = input.nextInt();

                System.out.println("Nhập số B");
                int b = input.nextInt();

                System.out.println("Chọn một phéo toán (+, -, *, /)");
                char operator = input.next().charAt(0);

                switch (operator) {
                    case '+':
                        System.out.println("a + b = " + (a + b));
                        break;
                    case '-':
                        System.out.println("a - b = " + (a - b));
                        break;
                    case '*':
                        System.out.println("a * b = " + (a * b));
                        break;
                    case '/':
                        System.out.println("a / b = " + (a / b));
                        break;
                    default:
                        System.out.println("Invalid operator");
                }

                break;
            case 7:
                System.out.println("In bảng cửu chương");
                System.out.println("Nhập số bảng cửu chương từ (1 -> 10");

                int s = input.nextInt();
                int[] mulTable = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

                for (int mul : mulTable) {
                    System.out.println(s + "*" + mul + " = " + s * mul);
                }
                break;
            case 8:
                System.out.println("Fibonacci");
                System.out.println("Nhập dãy số Fibonacci in ra từ 1 đến n");

                int d = input.nextInt();
                int f = 0;
                int h = 1;

                System.out.println("Dãy Fibonacci");

                if (d > 0) {
                    System.out.println("Fibonacci " + f);
                }

                if (d > 1) {
                    System.out.println("Fibonacci " + h);
                }

                for (int i = 2; i < d; i++) {
                    int next = f + h;
                    System.out.println(next + " ");
                    f = h;
                    h = next;
                }

                break;
            case 9:
                System.out.println("Đảo ngược số");
                System.out.println("Nhập số nguyên dương");

                int number = input.nextInt();

                int reveredNumber = 0;

                while (number != 0) {
                    int digit = number % 10;
                    reveredNumber = reveredNumber * 10 + digit;
                    number /= 10;
                }

                System.out.println("Số sau khi đảo ngược: " + reveredNumber);

                break;
            case 10:
                System.out.println("Tìm giá trị lớn nhất và nhỏ nhất");

                break;
            default:
                System.out.println("Invalid input");
        }
    }
}