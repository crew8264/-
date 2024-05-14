def solution(order):
    sach = ["iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything"]
    ohch = ["icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte"]
    answer = 0
    
    for k in order:
        if k in sach:
            answer += 4500
        elif k in ohch:
            answer += 5000
    
    return answer