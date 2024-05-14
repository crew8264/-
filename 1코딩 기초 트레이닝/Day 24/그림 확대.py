def solution(picture, k):
    answer = []
    # 한줄씩 스캔
    for ak in picture:
        # 변형한 줄을 저장할 공간
        tmp = ""
        # char 한글자를 k번 반복해서 저장
        for i in ak:
            tmp += i * k
        print(tmp)
        # k줄로 복사
        for i in range(k):
            answer.append(tmp)
    return answer