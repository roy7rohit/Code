 #include<stdio.h>
 void odd(int);
 void even(int);
 void main(){
 odd(9);
 }
 void odd(int n){
 if(n==0){
 return;
 }
 if(n%2 != 0){
 printf("%d", n);
 }
 even(n-1);
 }
 void even(int n){
 if(n==0){
 return;
 }
 if(n%2 == 0){
 printf("%d\n", n);
 }
 return odd(n);
 }
