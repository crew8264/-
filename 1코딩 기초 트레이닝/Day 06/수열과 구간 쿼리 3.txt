#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
// queries_rows는 2차원 배열 queries의 행 길이, queries_cols는 2차원 배열 queries의 열 길이입니다.
int* solution(int arr[], size_t arr_len, int** queries, size_t queries_rows, size_t queries_cols) {
    int* answer = (int*)malloc(sizeof(int) * arr_len);
    
    //duplicate
    for(int i = 0; i < arr_len; i++)
        answer[i] = arr[i];
    
    //working
    for(int i = 0; i < queries_rows; i++) {
        int tmp = 0;
        int qr1 = queries[i][0], qr2 = queries[i][1];
        
        tmp = answer[qr1];
        answer[qr1] = answer[qr2];
        answer[qr2] = tmp;
    }
    
    return answer;
}