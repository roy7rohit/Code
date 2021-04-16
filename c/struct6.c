#include<stdio.h>
#include<stdlib.h>
typedef struct employee{
int age;
int salary;
char name[10];
}emp; 
void main(){
emp *e, emp1;
printf("enter the info of employee");
scanf("%d", &emp1);
e = (emp*)malloc(emp1 *sizeof(emp)); 
for(int i=0; i<=emp1; i++){
printf("enter the info of an employee");
scanf("%d %d %s", &(e+i) -> age, &(e+i) -> salary, (e+i) -> name);
}
for(i=0; i<=emp1; i++){
printf("%d %d %s\n", (e+i) -> age, (e+i) -> salary, (e+i) -> name);
}
}
