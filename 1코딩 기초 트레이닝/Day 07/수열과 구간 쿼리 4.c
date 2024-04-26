#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
// queries_rows는 2차원 배열 queries의 행 길이, queries_cols는 2차원 배열 queries의 열 길이입니다.
int* solution(int arr[], size_t arr_len, int** queries, size_t queries_rows, size_t queries_cols) {
    int* answer = (int*)malloc(sizeof(int) * arr_len);
    //배열 복사
    for(int i = 0; i < arr_len; i++) {
        answer[i] = arr[i];
    }
    
    //쿼리 처리
    for(int i = 0; i < queries_rows; i++) {
        for(int j = queries[i][0]; j <= queries[i][1]; j++) {
            if(((j==0)?queries[i][2]:j) % queries[i][2] == 0){
                answer[j] += 1;
            }
        }
    }
    
    return answer;
}