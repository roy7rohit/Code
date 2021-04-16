#include<stdio.h>
void main(){

int n = 10;
loop:
printf("%d\n", n);
n--;

if (n >0)goto loop;

printf("fire\n");
}
