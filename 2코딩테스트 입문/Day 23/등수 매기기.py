def solution(score):
    avg = [sum(i)/2 for i in score]
    qwer = sorted(avg, reverse = True)
    
    answer = []
    for i in avg:
        answer.append(qwer.index(i)+1)
    
    
    return answer
