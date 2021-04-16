#include<stdio.h>
void main(){

int num;
printf("enter the num");
scanf("%d", &num);

for(int i=0; i<=num; i++){
      for(int j=i; j<=num; j++){
      
      printf("%d", j);
      }
printf("\n");
}

}
