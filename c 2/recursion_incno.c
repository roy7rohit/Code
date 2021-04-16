#include<stdio.h>
void dec_no(int);
void main(){
int n;
dec_no(9);
}
void dec_no(int n){
if(n==0){
return;
}
printf("%d", n);
dec_no(n-1);
}
