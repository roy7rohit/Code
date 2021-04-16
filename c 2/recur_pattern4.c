#include<stdio.h>
void fun(int n, int val){
   if(n==0){
         return;
         }   
   printf("%d", val);
   return fun(n-1, val-1+1);
}
void pattern(int n, int num){
   if(n==0){
         return;
   }
   fun(num-n+1, num-n+1);
   printf("\n");
   return pattern(n-1, num);
}
void main(){
int n = 5;
pattern(5, 5);
}
