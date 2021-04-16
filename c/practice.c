#include<stdio.h>
void main(){
int a = 30;
char *ch;
ch = (char *)&a;
printf("%d", *ch);
}
