#include<stdio.h>
void input(int *);
void display(int *);
void sort(int *);
void main(){
int a[5];
input(a); 
display(a);
sort(a);
display(a);
}

void input(int *p){
for(int i=0; i<=5; i++){
scanf("%d", (p+i));
}
}

void display( int *p){
for(int i=0; i<= 5; i++){
printf("%d ", *(p+i));
}
}

void sort(int *p){
int round, temp, i;
for(round=0; round <= 5; round++){
for(i=0; i<= 4; i++){
if(*(p+i) > *(p+i+1)){
temp = *(p+i);
*(p+i) = *(p+i+1);
*(p+i+1) = temp;
}
}
}
} 
