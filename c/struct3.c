#include<stdio.h>
struct emp{
int age;
int salary;
char name[10]; 
};
void main(){
struct emp *ptr, emp1;
ptr = &emp1;
printf("enter the age and salary of employee : ");
scanf("%d\n%d", &ptr -> age, &ptr -> salary);
printf("enter employee name : ");
scanf("%s", ptr -> name);
printf("display age = %d, salary = %d, name = %s", ptr -> age, ptr -> salary, ptr -> name);
}
