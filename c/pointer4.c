#include<stdio.h>
void main(){
int num[] = {11,22,33,44,55,66,77,88,99};
int i, *j;
for(i=0; i<9; i++){

printf("address of j = %p\n", &j);
printf("element of j = %d\n", *(&j));
}
}
