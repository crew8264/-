def solution(arr):
    answer = 0
    length = 0
    for i in range(len(arr)):
        for j in range(len(arr)):
            if(arr[i][j] == arr[j][i]):
                answer += 1
            length += 1
    
    print(answer, length)
    return 1 if answer == length else 0