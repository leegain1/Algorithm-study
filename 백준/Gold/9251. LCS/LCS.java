import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        // DP 테이블 생성, 각각 문자열의 길이에 1을 더해 생성
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        // DP 테이블 채우기
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                // 만약 두 문자가 같다면 이전 값에 1을 더함
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 문자가 다르면 위쪽 혹은 왼쪽 중 큰 값을 가져옴
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // 결과 출력: 최장 공통 부분 수열의 길이
        System.out.println(dp[str1.length()][str2.length()]);
    }
}
