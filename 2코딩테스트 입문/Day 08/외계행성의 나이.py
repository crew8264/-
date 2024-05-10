def solution(age):
    answer = str(age)
    
    a1 = chr(int(answer[0]) + 97)
    a2 = ''
    a3 = ''
    a4 = ''
    
    if (age / 10) >= 1:
        a2 = chr(int(answer[1]) + 97)
    if (age / 100) >= 1:
        a3 = chr(int(answer[2]) + 97)
    if (age / 1000) >= 1:
        a4 = chr(int(answer[3]) + 97)
    
    
    # 0 = a = 97
    # 9 = j = 109
    
    return a1 + a2 + a3 + a4