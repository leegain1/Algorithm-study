# 좌표 정렬하기 (버블 정렬을 이용한 방식)

# 1. 입력을 받음
# 첫 번째 줄에서 좌표의 개수를 받음
n = int(input())  # 첫 번째 줄에서 입력되는 좌표의 개수
coordinates = []

# 2. 좌표 데이터를 입력받아서 리스트에 저장
for _ in range(n):
    x, y = map(int, input().split())  # 각 줄에서 x, y 값을 입력받음
    coordinates.append((x, y))

# 3. 버블 정렬 함수 정의 (x, y 좌표를 정렬)
def bubble_sort(coords):
    n = len(coords)
    for i in range(n):
        for j in range(n - i - 1):
            # 3-1. x 좌표를 기준으로 먼저 비교
            if coords[j][0] > coords[j + 1][0]:
                coords[j], coords[j + 1] = coords[j + 1], coords[j]  # 스왑
            # 3-2. x 좌표가 같을 경우 y 좌표를 기준으로 비교
            elif coords[j][0] == coords[j + 1][0] and coords[j][1] > coords[j + 1][1]:
                coords[j], coords[j + 1] = coords[j + 1], coords[j]  # 스왑

# 4. 좌표 정렬
bubble_sort(coordinates)

# 5. 결과 출력
for x, y in coordinates:
    print(x, y)
