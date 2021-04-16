#include<stdio.h>
int fib(int);
void main(){
int n;
printf("enter the fib no. you want ot print :");
scanf("%d", &n);
printf("%d", fib(n));
}
int fib(int n){
if(n==1 || n==2){
return 1;
}
return fib(n-2)+fib(n-1);
}
