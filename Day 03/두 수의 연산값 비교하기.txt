#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b) {
    int answer = 0;
    int n1 = a * get_ten(b) + b;
    int n2 = 2 * a * b;
    answer = (n1>n2)?(n1):(n2);
    
    return answer;
}

int get_ten(int a) {
    int ten = 1;
    while(ten <= a)
        ten *= 10;
    printf("ten : %d\n", ten);
    return ten;
}