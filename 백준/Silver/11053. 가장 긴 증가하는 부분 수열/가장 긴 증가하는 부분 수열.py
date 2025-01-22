n = int(input())  
arr = list(map(int, input().split()))  

# DP 테이블 초기화
dp = [1] * n


for i in range(1, n):
    for j in range(i):
        if arr[i] > arr[j]:  
            dp[i] = max(dp[i], dp[j] + 1)  # dp[i]를 갱신


print(max(dp))
