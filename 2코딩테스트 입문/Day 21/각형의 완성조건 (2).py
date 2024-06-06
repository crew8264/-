def solution(sides):
    answer = 0
    
    # 긴 변 구하기
    sides.sort();
    minn = sides[0]
    maxx = sides[1]
    
    # sides가 가장 긴 경우,
    for i in range(1, maxx):
        if(check(minn, i, maxx)):
            answer += 1
    
    # 나머지가 가장 긴 경우,
    for i in range(maxx, 10000000):
        if(check(minn, maxx, i)):
            answer += 1
        elif(minn + maxx)>i:
            break
    return answer

def check(a, b, c):
    if(a + b) > c:
        return True
    else:
        return False