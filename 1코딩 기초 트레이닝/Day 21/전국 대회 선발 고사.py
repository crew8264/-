def solution(rank, attendance):
    answer = 0
    arr = []
    
    for i in rank:
        if attendance[rank.index(i)] == True :
            arr.append(i)
            
    arr.sort()
    answer += rank.index(arr[0]) * 10000
    answer += rank.index(arr[1]) * 100
    answer += rank.index(arr[2]) * 1
    
    return answer