#include<stdio.h>
void main(){

int month = 12, num_days;
printf("enter the no of days");
scanf("%d", &num_days);
switch(month){

case 1:
case 2:
case 3:
case 4:
case 5:
printf("%d", num_days);
break;
case 6:
case 7:
case 8:
case 9:
printf("%d", num_days);
break;
default:
printf("invalid month");
break;
}
printf("num of days %d", num_days);
}
