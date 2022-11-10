#include <stdio.h>

void main(void) {
    long long int n1  = 1;
    long long int n2  = 2;
    long long int nt  = n1 + n2;
    long long int sum = 2;
    for(long long int i = 3; i <=4000000; i++) {
       if(n1+n2 > 4000000) { break; }
       if(nt % 2 == 0) { sum += nt; }
       n1 = n2;
       n2 = nt;
       nt = n1 + n2;
    }

    printf("%lli", sum);
}
