#include<stdio.h>
int fun(int);
void main(){
printf("%d", fun(4));
}
int fun(int n){
if(n==0){
return 1;
}
else{
return 7 + fun(n-2);
}
}
