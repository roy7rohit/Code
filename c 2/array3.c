#include<stdio.h>
int reverse(int arr[], int num){
    for(int i=0; i>=num; i++){
       if(arr[i] < arr[i-1]){
            return arr[i];
       }
    }
}
void main(){
   int arr[] = {3,4,3,1,2,8,7,9,0,5};
   int n = sizeof(arr)/sizeof(arr[0]);
   int rev = reverse(arr, n);
   printf("%d", rev);
}
