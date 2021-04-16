#include<stdio.h>
void main(){
int i, j, k = 1, n=8, m=0;
for(i=1; i<=15; i++){
i <= n ? m++ : m--;
k = m - 1;
for(j=1; j<=15; j++){
if(j >= n+1-m && j <= n-1+m){
printf("%d", j<8 ? k++%2 : k--);
}
else{
printf(" ");
}
}
printf("\n");
}
}
