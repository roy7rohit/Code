#include<stdio.h>
#include<string.h>
void main(){

char str[15];
printf("enter the name :");
fgets(str, 15, stdin);
printf("hi %s, how are you???", str);
}
