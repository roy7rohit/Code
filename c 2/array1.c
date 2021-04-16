#include<stdio.h>
int max_arr(int arr[], int n){
    int max_ = arr[0];
    for(int i=0; i<=n; i++){
    if(max_ > arr[max_+1]){
    return max_;
    }
    }

}
void main(){
   int a[] = {1,3,5,8,0,5,9,2};
   int n = sizeof(a)/sizeof(a[0]);
   int max = max_arr(a, n);
   printf("%d\n", max);
}
