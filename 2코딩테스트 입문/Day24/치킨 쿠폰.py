def solution(chicken):
    answer = 0
    while(chicken > 1):
        answer += chicken / 10
        chicken /= 10
    return int(answer)
