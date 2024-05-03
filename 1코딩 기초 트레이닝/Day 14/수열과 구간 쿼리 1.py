def solution(arr, queries):
    answer = arr
    
    for i in range(0, len(queries)):
        for j in range(queries[i][0], queries[i][1]+1):
            answer[j] += 1
    
    return answer