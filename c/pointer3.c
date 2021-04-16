#include<stdio.h>
void main(){

int arr [] = {1,2,3,4,5,6,7,8,9,10};
int *j, *k;
j = &arr[4];
k = (arr + 9);
if(j == k){
printf("these two pointers are locating at the same location\n");
}
else{
printf("the pointers are not directing at the same location\n");
} 
}
