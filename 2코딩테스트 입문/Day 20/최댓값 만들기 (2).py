def solution(numbers):
    answer = 0
    numbers.sort()
    n1 = numbers[0] * numbers[1]
    n2 = numbers[-1] * numbers[-2]
    
    print(numbers)
    print(numbers[-1], numbers[-2], numbers[0], numbers[1])
    
    if n1 < n2:
        return n2
    else:
        return n1
