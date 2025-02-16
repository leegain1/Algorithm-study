//1543
//앞에서부터 문자찾고, 중복 잇는 문자 없음
//패턴길이만큼 탐색인덱스 더하기

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine(); // 찾을 패턴

        int textLength = text.length();
        int patternLength = pattern.length();
        int count = 0;
        int i = 0;


        while (i <= textLength - patternLength) { // (전체길이-패턴길이)로 마지막의 인덱스 설정.
            // 현재 위치부터 패턴이 일치하는지 확인
            if (text.substring(i, i + patternLength).equals(pattern)) {
                //substring(a,b+1):인덱스 a부터 b까지 문자 추출

                count++;
                i += patternLength; // 중복을 피하기 위해 패턴 길이만큼 건너뛰기

            } else {
                i++; // 패턴이 일치하지 않으면 한 칸 앞으로 이동
            }
        }

        System.out.println(count);
    }
}
