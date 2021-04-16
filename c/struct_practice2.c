#include<stdio.h>
#include<string.h>
typedef struct date{
int day;
int month;
int year;
}today;

typedef struct employee{
int DOB;
char name[20];
}emp;

void main(){
today t1 ,emp e1;
e1.DOB.day = 12;
e1.DOB.month = 12;
e1.DOB.year = 20;
printf("%d\n", e1.DOB.day);
printf("%d\n", e1.DOB.month);
printf("%d\n", e1.DOB.year);
}
