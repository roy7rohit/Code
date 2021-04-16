#include<stdio.h>
void main(){

int i=3, *x;
float j=1.5, *y;
char k='c', *z;
printf("value of %d\n", i);
printf("value of %f\n", j);
printf("value of %c\n", k);

x=&i;
y=&j;
z=&k;

printf("address of x = %p", &x);
printf("address of y = %p", &y);
printf("address of z = %p", &z);

x++;
y++;
z++;

printf("new address of x = %p", &x);
printf("new address of y = %p", &y);
printf("new address of z = %p", &z);
}
