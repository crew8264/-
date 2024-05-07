def solution(my_string, n):
    answer = ''
    for q in my_string :
        answer += q * n
    return answer