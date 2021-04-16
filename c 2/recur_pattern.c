#include<stdio.h>
void space(int s){
if(s==0){
return;
}
printf(" ");
space(s-1);
}
void star(int n){
if(n==0){
return;
}
printf("*");
star(n-1);
}
void pattern(int n){
if(n==0){
return;
}
//space(n-1);
//star(n - 1);
//printf("\n");
pattern(n-1);
star(n - 1);
printf("\n");
}
void main(){
int n = 5;
pattern(n);
}
