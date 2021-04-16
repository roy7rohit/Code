#include<stdio.h>
int star(int);
void main(){
for(int i=0; i<=5; i++){
printf("%d",star(5));
}

}
int star(int n){
if(n==0){
return 1;
}
star(n-1);
printf("*");
printf("\n");
}
