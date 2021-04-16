#include<stdio.h>
#include<stdlib.h>
struct student_info{
char subject_name[50];
int marks;
};
void main(){
struct student_info *studptr;
int i, noOfRecords;
printf("enter the no of records : \n");
scanf("%d", &noOfRecords);
studptr = (struct student_info *)malloc(noOfRecords *sizeof(struct student_info));
for(i=0; i<=noOfRecords; ++i){
printf("enter the subjects and their marks respectively : \n");
scanf("%s %d", (studptr+i) -> subject_name, &(studptr+i) -> marks);
}
for(i=0; i<=noOfRecords; ++i){
printf("%s %d\n", (studptr+i) -> subject_name, (studptr+i) -> marks);
}


}

