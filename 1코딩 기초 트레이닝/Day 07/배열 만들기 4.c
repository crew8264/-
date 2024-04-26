#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
int* solution(int arr[], size_t arr_len) {
    int* stk = (int*)malloc(sizeof(int) * arr_len);
    
    int i = 0, idx = 0;
    while(i < arr_len) {
        if (idx == 0)
            { stk[idx++] = arr[i++]; }
        else if (idx != 0 & (stk[idx-1] < arr[i])) 
            { stk[idx++] = arr[i++]; }
        else if (idx != 0 & (stk[idx-1] >= arr[i]))
            { stk[idx--] = 0; }
        
    }
    return stk;
}