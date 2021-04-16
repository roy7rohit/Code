#include<stdio.h>
void main(){
int n;
for (n = 10; n>0; n--){

printf("%d\n", n);

/*if (n == 5){
printf("countdown aborted\n");
break;
}*/
if (n == 5){

printf("we skipped 5\n");
continue;
}

}
}
