def solution(myString):
    answer = ""
    for st in myString:
        if ord(st) < 108:
            answer += "l"
        else :
            answer += st
        
    return answer