#include<stdio.h>
int find_arr(int a[], int n){
   int i;
   int guess = a[i];
   for(i=0; i<=n; i++){
      if(guess == a[i]){
      return a[i];
      }
      if(guess != a[i]){
      return -1;
      }
      }
  }
void main(){
    int arr[] = {1,2,3,4,6,7,9};
    int find;
    printf("enter the no to find in array : ");
    scanf("%d", &find);
    int n = sizeof(arr)/sizeof(arr[0]); 
    find = find_arr(arr, n);
    printf("%d", find);
}
