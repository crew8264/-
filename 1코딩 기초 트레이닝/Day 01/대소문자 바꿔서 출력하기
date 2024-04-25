#include <stdio.h>
#define LEN_INPUT 20

int main(void) {
    char s1[LEN_INPUT];
    scanf("%s", s1);
    
    for(int i = 0; i < LEN_INPUT; i++) {
        char ch = s1[i];
        
        if('A' <= s1[i] && 'Z' >= s1[i])
            printf("%c", ch + 32);
        else if('a' <= s1[i] && 'z' >= s1[i])
            printf("%c", ch - 32);
        else
            break;
    }

    return 0;
}
