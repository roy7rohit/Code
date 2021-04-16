#include<stdio.h>
void main(){
int a[] = {1,2,3,4,5,6}, *p;
p = &a[0];

for(int i=0; i<= 5; i++){
printf("%d\n", *p+i);
}
}
