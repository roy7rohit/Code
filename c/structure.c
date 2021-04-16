#include<stdio.h>
struct date{
int d, m, y;
};
void main(){
struct date today, d1;
d1 = today;
printf("enter today's day, month, year: ");
scanf("%d\n %d\n %d", &d1.d, &d1.m, &d1.y);
printf("enter today's date = %d, today's month = %d, today's year = %d", d1.d, d1.m, d1.y);
}
