def solution(num_list):
    length = len(num_list)
    
    if length >= 11 :
        answer = sum(num_list)
            
    else :
        answer = 1
        for n in num_list :
            answer *= n

    return answer