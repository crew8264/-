#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    float div = (float)(num1) / (float)(num2);
    return (int)(div * 1000);
}