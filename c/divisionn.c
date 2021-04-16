#include<stdio.h>
void main(){
int dividend, quot, remind, diviser;
printf("enter the dividend and divisor :");
scanf("%d\n %d\n", &dividend, &diviser);

quot = dividend/diviser;
remind = dividend%diviser;

printf("the quotient and reminders are %d and %d", quot, remind);

}
