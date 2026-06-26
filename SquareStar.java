package jump2java;
import java.util.Scanner;

public class SquareStar {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("높이를 입력하세요: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {      // 줄 수
            for (int j = 1; j <= n; j++) {  // 별 개수
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }

}

