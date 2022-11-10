#include <stdio.h>
#include <math.h>

int is_prime(int num)
{
     if (num <= 1) return 0;
     if (num % 2 == 0 && num > 2) return 0;
     for(int i = 3; i < floor(sqrt(num)); i+= 2)
     {
         if (num % i == 0)
             return 0;
     }
     return 1;
}


void main(void) {
    long long int n = 600851475143 ;
    for(long long int i=floor(sqrt(n)); i>0; i--) {
        if(n%i == 0 && is_prime(i)) { printf("%lli", i); break; }
      
    }
}

