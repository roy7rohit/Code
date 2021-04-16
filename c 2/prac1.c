#include<stdio.h>
int add(int, int);
int main(){
int m=20, n=50, sum;
sum = add(m, n);
printf("the sum of the fun is : %d\n", sum);
}
int add(int a, int b){
return(a + b);
}
