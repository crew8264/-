def solution(babbling):
    answer = 0
    preset = ["aya", "ye", "woo", "ma"]
    
    for i in range(len(babbling)):
        for j in range(len(preset)):
            if preset[j] + preset[j] in babbling[i]:
                continue
            if preset[j] in babbling[i]:
                babbling[i] = babbling[i].replace(preset[j], " ")
        babbling[i] = babbling[i].strip(' ')
    
    print(babbling)
    return babbling.count('')
