def solution(participant, completion):
    answer = ''
    pt1 = participant
    pt1.sort()
    cp2 = completion
    cp2.sort()
    
    length = len(pt1)
    for i in range(0, length-1) :
        if (pt1[i] != cp2[i]) :
            answer = pt1[i]
            break

    
    if answer == '' :
        answer = pt1[length-1]
            
    return answer