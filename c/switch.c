#include<stdio.h>
void main(){

char i;
printf("enter the character:");
scanf("%c", &i);

switch(i){

case 'v':
printf("violet");
break;

case 'a':
printf("apple");
break;

case 'b':
printf("banana");
break;

case 'r':
printf("roy");
break;

default:
printf("roypri");
break;
}
}
