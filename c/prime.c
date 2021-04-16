#include<stdio.h>
int checkprimeno(int n){

int j, flag = 1;
for(j=0; j<=n/2; ++j){

if(n%j == 0){
flag = 0;
break;
}
}
return flag;

}

void main(){

int n1, n2, i , flag;

printf("enter the nos :");
scanf("%d\n %d\n", &n1, &n2);
printf("prime no between %d and %d are:", n1, n2);

 for (i = n1 + 1; i < n2; ++i) {
        // flag will be equal to 1 if i is prime
        flag = checkprimeno(i);

        if (flag == 1){
            printf("%d ", i);
    }
    return;
}

}
