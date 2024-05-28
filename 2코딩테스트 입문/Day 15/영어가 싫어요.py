def solution(numbers):
    answer = ""
    arr = ["zer", "one", "two", "thr", "fou", "fiv", "six", "sev", "eig", "nin"]
    arr2 =[]
    
    # 앞에 세글자만 맞으면, 뒤에 알파벳은 모두 스킵
    tmp = ""
    for i in range(len(numbers)+1):
        tmp = numbers[i:i+3]
        if tmp in arr:
            answer += str(arr.index(tmp))
        
    return int(answer)