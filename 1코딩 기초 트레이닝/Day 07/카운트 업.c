#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int start_num, int end_num) {
    int* answer = (int*)malloc(sizeof(int) * ((end_num-start_num)+1));
    for(int i = start_num, idx = 0; i <= end_num; i++) {
        answer[idx++] = i;
    }
    return answer;
}