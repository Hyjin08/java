package test3;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // 올바른 입력이 들어올 때까지 반복
        while (true) {
            System.out.print("정수를 입력하세요: ");
            n = sc.nextInt();

            if (n > 0) {
                break;  // 정상 입력이면 반복 종료
            } else {
                System.out.println("1 이상의 정수를 입력하세요.");
            }
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("결과: " + result);

        sc.close();
    }
}