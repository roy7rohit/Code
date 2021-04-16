#include<stdio.h>
void odd_even(int);
void main(){
odd_even(5);
}
void odd_even(int n){
if(n==0){
return;
}
if(n%2 != 0){
printf("%d\n", n);
}
odd_even(n-1);
if(n%2==0){
printf("%d\n", n);
}
}

