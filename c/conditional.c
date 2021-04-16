#include<stdio.h>
void main()/*{
int value1 = 1, value2 = 2;
if (value1 == value2){
 
printf("value1 == value2 \n");

}
if (value1 != value2){

printf("value1 != value2\n");

}
if (value1 > value2){

printf("value1 > value2\n");

}
if (value1 < value2){

printf("value1 < value2\n");

}
if (value1 <= value2){

printf("value1 <= value2\n");
}

}*/

{
int val1, val2;
printf("enter the values :");
scanf("%d%d", &val1,&val2);

if (val1 == val1 && val2 == val2){

printf("==\n");

}
if (val1 == val2 || val1 >= val2 || val1 <= val2){

printf("we get the result\n");

}
if (val1 != val2 && val1 < val2){

printf("dont know what is happening\n");
}

}
