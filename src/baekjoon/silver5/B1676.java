package baekjoon.silver5;

import java.util.Scanner;

//참고: https://beginnerdeveloper-lit.tistory.com/18
// 곱하는 수식을 나열 했을 때 10의 개수를 센다.
// 10은 2*5 이고, 2는 짝수에 모두 있기 때문에 5의 개수만 구하면 끝자리 0의 개수를 구할 수 있다.
// 팩토리얼에서 5의 배수의 개수, 5^2의 배수의 개수, 5^3의 배수의 개수를 세고 더한다.
// 이때 중복을 제거 해야 되는데 5^2는 5의 배수와 중복되고 5가 두개 있기기 때문에 하나를 빼서 1개로 친다.
// 5^3의 경우도 5의 배수와 5^2의 배수와 중보되기 때문에 3개에서 2개 빼서 1개로 친다.
public class B1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c5 = n / 5;
        int c25 = n / (5 * 5);
        int c125 = n / (5 * 5 * 5);
        // n이 500 이하이기 때문에 5^4는 안함
        System.out.println(c5 + c25 + c125);
    }
}
