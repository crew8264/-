def solution(num, total):
    idx = total // num - (num-1) // 2
    
    answer = []
    for i in range(num):
        answer.append(idx+i)
    
    return answer
