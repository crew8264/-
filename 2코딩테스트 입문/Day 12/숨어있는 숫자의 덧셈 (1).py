def solution(my_string):
    answer = 0
    
    for st in my_string:
        if st.isdigit():
            answer += int(st)
    
    return answer