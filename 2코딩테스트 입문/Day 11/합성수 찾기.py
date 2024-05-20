def solution(n):
    answer = 0
    # n까지 반복.
    for i in range(1,n+1):
        # 자기 자신도 약수니까, 미리 1개.
        ctr = 1
        # 약수니까, n의 절반까지만 반복해도 됨
        for j in range(1,(i//2)+1):
            if (i % j) == 0:
                ctr += 1
        # 합성수이면 answer + 1
        if ctr >= 3:
            answer += 1
            print(i)
    return answer