def solution(num_list):
    lsum = 0
    rsum = 0
    
    for i in range(0, len(num_list), 2):
        lsum += num_list[i]
    
    for i in range(1, len(num_list), 2):
        rsum += num_list[i]
    
    if lsum > rsum :
        return lsum
    else :
        return rsum