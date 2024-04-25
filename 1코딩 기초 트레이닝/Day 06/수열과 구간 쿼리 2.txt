#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
// queries_rows는 2차원 배열 queries의 행 길이, queries_cols는 2차원 배열 queries의 열 길이입니다.
int* solution(int arr[], size_t arr_len, int** queries, size_t queries_rows, size_t queries_cols) {
    int* answer = (int*)malloc(sizeof(int) * queries_rows);
    
    for(int i = 0; i < queries_rows; i++) {
        int tmp = 1000001;
        for(int j = queries[i][0]; j <= queries[i][1]; j++) {
            if((queries[i][2] < arr[j])&(tmp  > arr[j])) {
                tmp = arr[j];

            }
        answer[i] = (tmp == 1000001)?(-1):(tmp);
        }
    }
    
    return answer;
}