import java.util.Scanner;

/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
*/

/*
nextInt()
Scanner.nextInt 메소드는 사용자 입력의 가장 마지막 개행문자(엔터, newline)를 제거하지 않음
개행문자(엔터) 전까지만 숫자로 입력 받는다.
개행문자(엔터)는 다음에 호출된 Scanner.nextLine( ) 메소드의 입력으로 처리되서 문제가 발생한다.
*/
public class qj_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            String[] arr = sc.next().split(",");

            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
    }
}