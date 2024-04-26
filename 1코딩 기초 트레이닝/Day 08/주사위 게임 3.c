#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

int compare(const int* a, const int* b) {
	return(*a - *b);
}

int solution(int a, int b, int c, int d) {
    int answer = 0, min = 7, max = 0;
    int arr[4];
    
    arr[0] = a; 
    arr[1] = b; 
    arr[2] = c; 
    arr[3] = d;
    
    qsort(arr, 4, sizeof(int), compare);
    for(int i = 0; i < 4; i++) { printf("%d ", arr[i]); }
    
    // 네가지가 같은 경우
    if(arr[0] == arr[3])
        answer = arr[0] * 1111;
    // 분기1 : '일단' 가운데 두 수가 같은 경우
    else if(arr[1] == arr[2]){
        // 분기2 : 세 수가 같은 경우
        if(arr[0] == arr[1])
            answer = ((10 * arr[0]) + arr[3]) * ((10 * arr[0]) + arr[3]);
        else if(arr[2] == arr[3])
            answer = ((10 * arr[3]) + arr[0]) * ((10 * arr[3]) + arr[0]);
        // 예외 : 두수 같고 두수 다른 경우
        else {
            answer = arr[0] * arr[3]; printf("adsd\n");}
    // 분기2 : 두수 두수가 같은 경우
    } else if((arr[0] == arr[1]) & (arr[2] == arr[3]))
        answer = (arr[1] + arr[2]) * (arr[2] - arr[1]);
    // 두 수만 같고 나머지는 다른 경우
    else if(arr[0] == arr[1])
        answer = arr[2] * arr[3];
    else if(arr[2] == arr[3])
        answer = arr[0] * arr[1];
    else
        answer = arr[0];
        
    
    return answer;   
}
    
