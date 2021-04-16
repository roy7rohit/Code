#include<stdio.h>
#include<string.h>
struct date{

int year;
int month;
int day;
};

struct employee{

long int emp_no;
int emp_dob;

};
void main(){

struct employee E;
/*E.emp_no = 9999934500;
E.emp_dob.year = 1999;
E.emp_dob.month = 2;
E.emp_dob.day = 7;*/

E.year = 1999;
E.month = 2;
E.day = 7;

//printf("employee no = %ld\n", E.emp_no);
printf("employee date of birth year = %d\n", E.year);
printf("emoloyee date of birth month = %d\n", E.month);
printf("employee date of birth date = %d\n", E.day);
}
