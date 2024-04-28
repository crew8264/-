#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string, int n) {
    int length = strlen(my_string), idx = 0;
    char* answer = (char*)malloc(length+1);
    
    for(int i = length-n; i < length; i++) {
        answer[idx++] = my_string[i];
    }
    answer[idx] = '\0';
    return answer;
}