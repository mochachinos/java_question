import java.util.ArrayList;
import java.util.Scanner;

/*
문제
입력 받은 대로 출력하는 프로그램을 작성하시오.

입력
입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.

출력
입력받은 그대로 출력한다.
*/

public class qj_11719_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<String>();
        int cnt = 0;

        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            if (str.length() > 100 || cnt > 100) {
                break;
            }

            strList.add(str);
            cnt++;
        }

        sc.close();

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}