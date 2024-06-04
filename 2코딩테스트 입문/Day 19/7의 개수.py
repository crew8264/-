def solution(array):
    answer = 0
    text = ""
    for st in array:
        text += str(st)
    
    for ch in text:
        if ch == '7':
            answer+=1
    
    return answer
