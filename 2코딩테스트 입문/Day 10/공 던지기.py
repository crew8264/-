def solution(numbers, k):
    # In fact, its too hard to me
    answer = numbers[(2 * (k-1)) % len(numbers)]
    return answer