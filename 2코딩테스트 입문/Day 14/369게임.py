def solution(order):
    answer = 0
    
    for st in str(order):
        if st in ['3', '6', '9']:
            answer += 1
            
    return answer