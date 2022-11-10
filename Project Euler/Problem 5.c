#include <stdio.h>
#include <stdlib.h>

void main(void) {
    int count = 0;
    for(int i = 1; i < 232792561; i++) {
        for(int j = 1; j <=20; j++) {
            if(i % j == 0)  { count++; }
        }
        if(count == 20) { printf("%i", i); break; }
        count = 0;
        
    }
    printf("lolo");
}

