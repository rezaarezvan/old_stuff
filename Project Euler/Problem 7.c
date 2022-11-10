#include <stdio.h>
#include <math.h>

int is_prime(int num)
{
     if (num <= 1) return 0;
     if (num % 2 == 0 && num > 2) return 0;
     for(int i = 3; i <= floor(sqrt(num)); i+= 2)
     {
         if (num % i == 0)
             return 0;
     }
     return 1;
}

void main(void) {
    int count = 0;
    for(int i = 2; i <= 105000; i++) {
        if(is_prime(i)) { count++; }
        if(count == 10001) { printf("%i\n", i); break;}
        

    }
    printf("%i\n", count);

}