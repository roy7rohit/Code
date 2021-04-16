#include<stdio.h>
char* reverse(char*);
void display(char*);
void main(){

char* str;
display(str);
printf("%s", reverse("rohitpriyanshi"));

}
char* reverse(char* p){
int l, i;
char temp;
for(l=0; *(p+l) != '\0'; p++);
for(i=0; i<l/2; i++){
temp = *(p+l);
*(p+l) = *(p+l-1-i);
*(p+l-1-i) = temp;
}
return(p);
}
void display(char* p){
for(int l=0; l!='\0'; l++){

printf("%s\n", (p+l));
}
}
