#include<stdio.h>
void main(){
int i, j, k = 0;
for(i=1; i<=9; i++){
k++;
for(j=1; j<=9; j++){
if(j <= 6-k || j >= 4+k){
i <= 5 ? k++ : k--;
if(i <= 5){
k++;
}
if(i >= 5 + 1){
k--;
}
printf("%d", k);
}
k--;
}
else{
printf(" ");
}
}
printf("\n");
}
}
