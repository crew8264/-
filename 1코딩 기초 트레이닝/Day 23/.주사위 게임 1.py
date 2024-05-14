def solution(a, b):
    answer = 0
    Ea = eod(a)
    Eb = eod(b)
    
    if (Ea == 1) and (Eb == 1) :
        answer += a*a + b * b
    elif (Ea == 1) or (Eb == 1) :
        answer += 2 * (a + b)
    else :
        answer += abs(a-b)
    
    return answer

def eod(k):
    print(int((k % 2) != 0))
    return int((k % 2) != 0)