#include<stdio.h>
void star(int n){
if(n==0){
return;
}
printf("*");
return star(n-1);
}
void pattern(int n, int i){
if(n==0){
return;
}
star(i);
printf("\n");
return pattern(n-1, i+1);
}
void main(){
int n = 10; 
pattern(n, 1);
}
