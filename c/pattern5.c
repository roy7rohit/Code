#include<stdio.h>
void main(){

for(int i = 0; i <= 5; i++){
//the no of spaces want to print in(j) loop:
for(int j = i; j < 5; j++){

printf(" ");
}
//to print the '*' pattern
for(int  k = 1; k <= i; k++){

printf("*");
}
printf("\n");
}

}


