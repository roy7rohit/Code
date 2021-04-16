#include<stdio.h>
void recur(int);
void main(){
recur(5);
}
void recur(int a){
   if(a == 0){
      return; 
      }
     recur(a - 1);
     printf("%d\n", a);
}
