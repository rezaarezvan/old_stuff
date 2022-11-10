#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int sum_squares(int n) {
    int sum = 0;
    for(int i = 1; i <= n; i++){
        sum += pow(i, 2);
    }
    return sum;
}

int squares_sum(int n){
    int sum = 0;
    for(int i = 1; i <= n; i++){
        sum += i;
    }
    return sum*sum;
}

void main(void) {
    int sq = sum_squares(100);
    int qs = squares_sum(100);
    printf("%i\n", sq);
    printf("%i\n", qs);
    printf("The diffrence is: %i - %i = %i\n", sq,qs,abs(sq-qs));
}
