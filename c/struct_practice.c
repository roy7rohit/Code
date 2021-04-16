#include<stdio.h>
#include<string.h>
typedef struct student{
int rollno;
char name[10];
int id;
} stud;
stud display(stud s);
void main(){
stud s1;
s1 = display(s1);
}
stud display(stud s){
s.rollno = 131;
strcpy(s.name, "rohit");
s.id = 70000;
printf("%d\n", s.rollno);
printf("%s\n", s.name);
printf("%d\n", s.id);
}
