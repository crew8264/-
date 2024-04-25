#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numLog_len은 배열 numLog의 길이입니다.
char* solution(int numLog[], size_t numLog_len) {
    char* answer = (char*)malloc((sizeof(int) * numLog_len)-1);
    
    for(int i = 1, tmp = numLog[0]; i < numLog_len; i++) {
        if(numLog[i] == (tmp + 1)) {
            answer[i-1] = 'w';
            tmp += 1;
        }else if(numLog[i] == (tmp - 1)) {
            answer[i-1] = 's';
            tmp -= 1;
        }else if(numLog[i] == (tmp + 10)) {
            answer[i-1] = 'd';
            tmp += 10;
        }else if(numLog[i] == (tmp - 10)) {
            answer[i-1] = 'a';
            tmp -= 10;
        }else { continue; }
    }
    answer[numLog_len-1] = '\0';
    return answer;
}