def solution(i, j, k):
    answer = 0
    akb48 = ''
    
    # 전부 더한 str배열
    for ak47 in range(i, j+1):
        akb48 += str(ak47)
    
    # 그 배열에서 k를 센다
    for bull in akb48:
        if bull == str(k):
            answer += 1
    return answer
