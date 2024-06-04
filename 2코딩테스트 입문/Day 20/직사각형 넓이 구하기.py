import math
def solution(dots):
    dots.sort()
    
    width = dots[1][1] - dots[0][1]
    length = dots[2][0] - dots[0][0]
    
    return width * length
