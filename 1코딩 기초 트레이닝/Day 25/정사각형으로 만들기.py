def solution(arr):
    answer = [[]]
    
    row = len(arr[0])
    col = len(arr)
    print(row, col)
    
    if row < col :
        for i in range(col):
            answer.append(arr[i])
        for i in range(1, col+1):
            for j in range(col-row):
                answer[i].append(0)
            print("appendrow")
            
    elif row > col :
        for i in range(col):
            answer.append(arr[i])
        for i in range(row-col):
            answer.append([0] * row)
            print("appendcol")
            
    else :
        for i in range(col):
            answer.append(arr[i])
    
    answer.remove([])
    return answer