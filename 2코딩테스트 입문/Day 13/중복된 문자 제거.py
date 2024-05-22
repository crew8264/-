def solution(my_string):
    answer = ''
    for st in my_string:
        if st in answer:
            continue
        answer += st
    return answer