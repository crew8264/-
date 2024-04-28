#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// intStrs_len은 배열 intStrs의 길이입니다.
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int* solution(const char* intStrs[], size_t intStrs_len, int k, int s, int l) {
    int* answer = (int*)malloc(sizeof(int)*(intStrs_len));
    int iidx = 0;
    
    //intStrs_len 번 반복.
    for(int i = 0; i < intStrs_len; i++) {
        int idx = 0;
        char tmp[10000];    
        //인덱스 끊어서 배열 복사
        for(int j = s; j < s+l; j++) {
            tmp[idx++] = intStrs[i][j];
        }
        //배열 길이 모르니까 추가.
        tmp[s+1] = '\0';
        int kk = atoi(tmp);
        
        printf("%d\n", kk);
        //맞으면 answer로 넘기기
        if(kk > k)
            answer[iidx++] = kk;
    }
    answer[iidx] = '\0';
    return answer;
}