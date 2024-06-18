def solution(bin1, bin2):
    b1 = int(bin1,2)
    b2 = int(bin2,2)
    
    # str로, 이진수 덧셈, [0b...]의 3번째 자리부터
    return str(bin(b1+b2))[2:]
