#include<stdio.h>
void main(){

char str[40], ch;
int i, count = 0;
printf("enter the string:");
fgets(str, sizeof(str), stdin);
printf("enter the character to find its frequency :");
scanf("%c", &ch);

for(i=0; str[i]!= '\0'; ++i){

              if(ch == str[i]){
              
              ++count;
              }
}
printf("frequcncy of %c = %d :", ch, count);
}
