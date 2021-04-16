#include<stdio.h>
int *find_mid(int a[], int n){
    return &a[n/2];
}
void main(){
  int arr[] = {12,5,67,10};
  int n = sizeof(arr)/sizeof(arr[0]);
  int *mid = find_mid(arr, n);
  printf("%d\n", *mid);
}
