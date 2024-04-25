#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* code) {
    int length = strlen(code);
    char* answer = (char*)malloc(length);
    
    int i, idx, mode = 0;
    for(i = 0, idx = 0; i < length; i++) {
        
        //even
        if(mode == 0) {
            if((code[i] != '1')&(i % 2 == 0)) { answer[idx++] = code[i]; }
            else if(code[i] == '1') { mode = 1; }
        }
        
        //odd
        else if(mode == 1) {
            if((code[i] != '1')&(i % 2 == 1)) { answer[idx++] = code[i]; }
            else if(code[i] == '1') { mode = 0; }
        }
        
        //printf("i:%d idx:%d mode:%d code[i]:%c\n", i, idx, mode, code[i]);
    }
    
    answer[idx] = '\0';
    if(idx == 0) { answer = "EMPTY"; }
    printf("%s\n", answer);
    
    return answer;
}