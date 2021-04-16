#include<stdio.h>
void main(){

int i, j, k;// k is for toggling the input value
for(i=0; i<=5; i++){
              k++;
for(j=1; j<=9; j++){
if(j >= 6 - i && j <= 3 + i && k){
printf("*");
k = 0;
}
else{
printf(" ");
k = 1;
}
}
printf("\n"); 
}




}
