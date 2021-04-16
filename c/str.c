#include<stdio.h>
void displayStr(char str[]){

printf("o/p string :");
puts(str);
}

void main(){
char str[20];
printf("enter the name :");
fgets(str, 20,stdin);
printf("%s\n", str);
return;

}
