//6550
//인덱스 따로따로 생각해야함, 각각의 인덱스를 합쳣을때 s문자열이 되느냐
//순서는 바뀌지 않음! --> while for문 이용
//패턴 인덱스 앞에서부터 탐색 -> i : 패턴 , j : text
// Yes, NO 상자
// 길이 중요.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력이 있는 동안 반복--> hasNext
        while (sc.hasNext()) {
            // s와 t 문자열 입력받기
            String s = sc.next();
            String t = sc.next();

            // s에서 현재 확인할 문자의 위치
            int a = 0;

            // t의 모든 문자를 하나씩 확인
            for (int i = 0; i < t.length(); i++) {
                // t의 현재 문자가 s의 a 번째 문자와 같으면 a를 증가
                if (t.charAt(i) == s.charAt(a)) {
                    a++;
                }
                // 만약 s의 모든 문자를 다 찾았으면 반복문을 끝냄
                if (a == s.length()) {
                    break;
                }
            }

            // a가 s의 길이와 같으면 s의 모든 문자가 t에서 찾아졌다는 뜻-> Yes 출력
            if (a == s.length()) {
                System.out.println("Yes");
            }
            // 그렇지 않으면 No 출력
            else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}

