#include<stdio.h>
void main(){
char somechar, reply = 'y';
int asc_val;
while(reply == 'y' || reply == 'Y'){
printf("enter an alphabet:\n");
scanf("%c", &somechar);
asc_val = somechar;
printf("ascii value of somechar is %d\n", somechar);
printf("%d\n", asc_val);
printf("do you want to print any other alphabet:\n");
scanf("%c", &reply);
}
}
