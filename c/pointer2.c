#include<stdio.h>
void main(){
int arr[] = {12, 13,14,15,16,17,18,19,20};
int *i, *j;
i = &arr[1];
j = &arr[5];

printf("%ld\n", j - i);
printf("%d\n", *j - *i);
}
