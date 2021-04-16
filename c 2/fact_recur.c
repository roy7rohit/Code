#include<stdio.h>
int fact(int);
void main(){
int n;
printf("enter the nos of which you want factorial : ");
scanf("%d", &n);
printf("%d\n", fact(n));
}
int fact(int n){
if(n<1){
return 1;
}
return n*fact(n-1);
}
