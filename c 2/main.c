#include<stdio.h>
#include<stdlib.h>
int file_add(int, int);
int main(){
int sum;
sum = file_add(8, 3);
printf("%d", &sum);
return 0;
}
