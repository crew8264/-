#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int even = 0, odd = 0, evena = 0, odda = 0;
    
    for(int i = num_list_len-1; i > -1; i--) {
        if(num_list[i] % 2 == 0) { even += pow(10, evena++) * num_list[i]; }
        else if(num_list[i] % 2 == 1) { odd += pow(10, odda++) * num_list[i]; }
    }
    
    //printf("numlistlen:%d evena:%d odda:%d\n", num_list_len, evena, odda);
    int answer = even + odd;
    return answer;
}
