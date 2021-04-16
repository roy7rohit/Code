#include<stdio.h>
#include<string.h>
typedef struct student{
int roll;
char name[10];
int id;
}baccha_party;//here we are creating new type of data by using {typedef} keyword

void main(){
baccha_party s1;
s1.roll =  55;
strcpy(s1.name, "rohit");
s1.id = 131;
printf("%d\n", s1.roll);
printf("%s\n", s1.name);
printf("%d\n", s1.id);

}
