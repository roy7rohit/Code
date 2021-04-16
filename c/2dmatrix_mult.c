#include<stdio.h>
void main(){
int a[10][10], b[10][10], mul[10][10], r, c, i, j, k;

printf("enter the no of rows : ");
scanf("%d ", &r);
printf("enter the no of coloumn : ");
scanf("%d ", &c);
printf("enter the element of first matrix : \n");
for(i=0; i<r; i++){
for(j=0; j<=c; j++){

printf("%d\n", a[i][j]);
}
}
printf("enter the element of first matrix : \n");
for(i=0; i<=r; i++){
for(j=0; j<=c; j++){
printf("%d\n", b[i][j]);
}
}
printf("do the multiplication of matrix : \n");
for(i=0; i<=r; i++){
for(j=0;j<=c; j++){
mul[i][j] = 0;
for(k=0; k<=c; k++){
mul[i][j] += a[i][k] * b[k][j];   

printf("show the result of matrix multiplication : \n");
for(i=0; i<=r; i++){
for(j=0; j<=c; j++){
printf("%d\n", mul[i][j]);
}
}
}
}
}
}
