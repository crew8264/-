//입력값 조건을 결괏값에도 적용하지 말 것.
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int numer1, int denom1, int numer2, int denom2) {
    int* answer = (int*)malloc(2);
    
    // 최소공배수 찾기
    int minum = 1000000;
    for(int i = 1; i < 10000000; i++) {
        if((i % denom1 == 0)&(i % denom2 == 0)) {
            minum = i; break; }
    }
    
    // 통분
    int d1 = denom1, d2 = denom2, n1 = numer1, n2 = numer2;
    n1 = numer1 * (minum/d1);
    d1 = d2;
    n2 = numer2 * (minum/d2);
    d2 = d1;
    
    // 대입
    answer[0] = n1 + n2;
    answer[1] = minum;
    
    // 약분
    minum = 10000000; int atk = (answer[0]<answer[1]) ? answer[1] : answer[0];
    for(int i = atk; i > 1; i--) {
        if((answer[0] % i == 0)&(answer[1] % i == 0)) {
            minum = i;
            answer[0] /= minum;
            answer[1] /= minum;
            break;
        }
    }
    
    return answer;
}