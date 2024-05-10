def solution(emergency):
    answer = []
    srt = []
    
    srt = sorted(emergency)
    srt.reverse()
    
    for i in emergency:
        answer.append(srt.index(i)+1)
    
    return answer