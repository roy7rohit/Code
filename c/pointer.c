#include<stdio.h>
void main(){
/*int x  = 5; 
int *j;
j = &x;

printf("%d\n%p\n", x, j);
printf("%d\n%p\n", *j, &x);
printf("%p\n", *&j);*/

int x = 5, *p, *q, **r;
p = &x;
q = &x;
r = &q;
*p = 6;
p+1;
p - q;

//**q = 7;
//***r = 9;
/*printf("%d\n", *p);
printf("%d\n", **q);
printf("%d\n", ***r);*/

printf("%ld\n", p - q);
printf("%p\n", r);
printf("%p\n", q);
printf("%d\n", x);


}
