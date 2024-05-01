def solution(str_list):
    answer = []
    lidx = 999; ridx = 999
    if 'l' in str_list:
        lidx = str_list.index('l')
    if 'r' in str_list:
        ridx = str_list.index('r')
    
    print(lidx, ridx)
    if lidx < ridx :
        answer = str_list[:lidx]
    elif lidx > ridx :
        answer = str_list[ridx+1:]
    else:
        answer = []
    
    return answer