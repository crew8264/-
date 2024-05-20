def solution(my_string):
    answer = []
    stt = ['1','2','3','4','5','6','7','8','9','0']
    
    for st in my_string:
        if st in stt:
            answer.append(int(st))
            
    answer.sort()
    return answer