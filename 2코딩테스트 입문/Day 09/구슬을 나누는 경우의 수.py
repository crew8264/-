def solution(balls, share):
    answer = 0
    factN = factorial(balls)
    factM = factorial(share)
    factNM = factorial(balls - share)
    
    answer = factN / (factNM * factM)
    
    return answer

def factorial(n):
    a = 1
    for i in range(1, n+1):
        a *= i
    return a