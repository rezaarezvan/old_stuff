#include <stdio.h>
#include <stdlib.h>

int is_palindrome(int n) {
    int n1, rev = 0, rem;
    n1 = n;
    //logic
    while (n > 0){
        rem = n % 10;
        rev = rev * 10 + rem;
        n = n / 10;
    }
    
    if (n1 == rev){
        return 1;
    }
    else{
        return 0;
    }    
}

void main(void){
    int max = -1;
    for(int i = 999; i >= 100; i--) {
        for(int j = 999; j >= 100; j--) {
            if( (i*j) > max && is_palindrome(i*j) == 1) { max = (i*j); }
        }
    }

    printf("%i", max);

}
