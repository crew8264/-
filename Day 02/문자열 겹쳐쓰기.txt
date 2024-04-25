#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string, const char* overwrite_string, int s) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char myString[1000];
    int msrlen = strlen(my_string);
    for(int j = 0; j < msrlen; j++) {
        myString[j] = my_string[j];
    }
    //printf("%s\n", myString);
    
    
    int ovrlen = strlen(overwrite_string);
    for(int i = s, index = 0; index < ovrlen; i++, index++) {
        myString[i] = overwrite_string[index];
    }
    //printf("%s\n", myString);
    
    
    
    char* answer = (char*)malloc(sizeof(char) * (msrlen+1));
    for(int i = 0; i < msrlen; i++) {
        answer[i] = myString[i];
    }
    answer[msrlen] = '\0';
    
    
    return answer;
}