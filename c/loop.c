#include<stdio.h>
void main(){
int j;
for (j = 0 ;j<5; ++j){
printf("%d \n", j*j);

if ( j == 3){
	break;
}
}
}
