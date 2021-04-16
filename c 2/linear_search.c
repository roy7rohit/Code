#include<stdio.h>
int linear_search(int arr[], int search, int i, int size){
   if(i == size){
       return 0;
   }
   if(arr[i] == search){
       return 1;
   }
   return linear_search(arr, search, i+1, size);
}
void main(){
   int arr[] = {2,4,6,3,8,7,9};
   int size = sizeof(arr)/sizeof(arr[0]);
   int search = 8;
   printf("%d%d%d", linear_search(arr, search, 0, size));
}
