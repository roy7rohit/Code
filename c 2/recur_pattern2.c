#include<stdio.h>
void space(int s){
    if(s==0){
           return;
}
    printf(" ");
    return space(s-1);
}
void star(int n){
    if(n==0){
            return;
}
    printf(" *");
    return star(n-1);
}
void pattern(int n, int num){
    if(n==0){
            return;
            }
    space(n-1);
    star(num-n+1);
    printf("\n");
    return pattern(n-1, num);
}
int main(){
    int n=5;
    pattern(n, n);
    return 0;
}
