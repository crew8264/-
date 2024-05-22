def solution(cipher, code):
    answer = ''
    
    answer = cipher[code-1::code]
    
    '''
    for i in range(code-1, len(cipher), code):
        answer += cipher[i]
    '''
    
    return answer