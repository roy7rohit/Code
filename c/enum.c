#include<stdio.h>
enum boolean{
true,
false
};
enum boolean iseven(int x){
if(x%2 == 0){
return true;
}
else{
return false;
}
}
void main(){
int n;
enum boolean result;
printf("enter the no :");
scanf("%d", &n);
result = iseven(n);
if(n == true){
printf("the value is even");
}
else{
printf("the value is false");
}
}
