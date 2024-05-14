def solution(n):
    answer = [[]]
    idx = 0
    
    for i in range(n):
        tmp = []
        for j in range(n):
            if j == idx:
                tmp.append(1)
            else :
                tmp.append(0)
        answer.append(tmp)
        idx += 1
        
    answer.remove([])
    return answer

'''
def solution(n):
    answer=[[0]*n for i in range(n)]
    for i in range(n): answer[i][i]=1
    return answer
'''