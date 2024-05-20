def solution(my_string):
    answer = ''
    stt = ['a', 'e', 'i', 'o', 'u']
    for i in my_string:
        if i not in stt:
            answer += i
    return answer