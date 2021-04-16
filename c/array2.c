#include<stdio.h>
void main(){
int i;
float x[10], total;

printf("enter the no :");
for(i=0; i<10; i++){

scanf("%f", &x[i]);
total = 0.0;

}
for (i=0; i<10; i++){

total = x[i]*x[i];
printf("\n");
printf("x at %d\n", i+1); 
printf("i  = %f\n", x[i] );
printf("total is %f\n", total);
}


}
