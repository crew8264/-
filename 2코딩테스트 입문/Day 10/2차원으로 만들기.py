def solution(num_list, n):
    answer = [[]]
    tmp = 0
    
    for i in range(n, len(num_list)+1, n):
        tmpL = []
        for k in range(n):
            tmpL.append(num_list[tmp])
            tmp += 1
        answer.append(tmpL)
    answer.remove(answer[0])
    
    return answer