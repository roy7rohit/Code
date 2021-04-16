#include<stdio.h>
#include<string.h>
typedef struct person{
int age;
char name[10];
}emp;
void main(){
emp *empptr, employee1;
empptr = &employee1;
printf("enter the age of employee : ");
scanf("%d", &empptr -> age);
printf("enter the name of employee : ");
scanf("%s", empptr -> name);
printf("display age = %d, name = %s", empptr -> age, empptr -> name);
}
