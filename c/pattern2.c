#include<stdio.h>
void main(){
int num;
printf("enter tne no of rows");       
scanf("%d", &num);
for(int i=1; i<=num+1; i++){
              for(int j=1; j<=i ;  j++){
              
              printf("%d", i);
             
              }
printf("\n");            
}
}
/*
1
22
333
4444
55555
*/
