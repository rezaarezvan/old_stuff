#include <stdio.h>
/* count number of digits */
void main(void) {
    int c = 0; /* digit position */
    int n = 1;

    while (n != 0) {
        n /= 10;
        c++;
    }

    int numberArray[c];
    for(int i = 0; i < c; i++) {
        printf("%i", numberArray[i]); 
    }
}