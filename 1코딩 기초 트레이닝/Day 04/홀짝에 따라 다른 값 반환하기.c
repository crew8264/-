#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    
    if(n % 2 == 0) {
        answer = pivat(n);
    } else {
        answer = pivot(n)+1;
    }
    
    return answer;
}

int pivot(int a) {
    if(a <= 0)
        return a;
    else
        return a + pivot(a-2);
}

int pivat(int a) {
    if(a <= 0)
        return a*a;
    else
        return (a*a + pivat(a-2));
}