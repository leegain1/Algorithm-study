n = int(input())  
cost = [list(map(int, input().split())) for _ in range(n)] 

# DP 테이블 초기화 (첫 번째는 그대로 사용)
dp = [[0] * 3 for _ in range(n)]  
dp[0][0], dp[0][1], dp[0][2] = cost[0][0], cost[0][1], cost[0][2]

# 두 번째 집부터 n번째 집까지 반복
for i in range(1, n):
    dp[i][0] = min(dp[i-1][1], dp[i-1][2]) + cost[i][0]  # 빨간색 칠하는 경우
    dp[i][1] = min(dp[i-1][0], dp[i-1][2]) + cost[i][1]  # 초록색 
    dp[i][2] = min(dp[i-1][0], dp[i-1][1]) + cost[i][2]  # 파란색 

# 마지막 집에서의 최소 비용
print(min(dp[n-1][0], dp[n-1][1], dp[n-1][2]))
