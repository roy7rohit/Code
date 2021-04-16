#include<stdio.h>
void main(){
int i, j, k=0;
for(i=1; i<=11; i++){
for(j=1; j<=11; j++){
if(j >= 7-i && j <= 5+i){
j <= 6 ? k++ : k--;
printf("*");

}
else{
printf(" ");
}
}
printf("\n");
}
}
