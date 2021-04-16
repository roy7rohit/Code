#include<stdio.h>
void main(){
int num;
printf("enter the num of rows:");
scanf("%d", &num);
for(int i=1; i<=num; i++){
for(int j=1; j<=i; j++){
//for(int k=1; k<=j; k++){
printf(" * ");
//}
}
i = i+1;
printf("\n");
}
}
