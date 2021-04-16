#include<stdio.h>
char* reverse(char *);
int length(char *);
void main(){
printf("%d", length("rohitsingh"));
printf("\n %s", reverse("rohitsingh"));
}
char* reverse(char *p){
int l, i;
char temp;
for(l=0; l != '\0'; i++){
for(i=0; i<l/2; i++){
temp = *(p+i);
*(p+i) = *(p + l -1 -i);
*(p + l -1 -i) = temp;
}
return p;
}
}

int length(char *p){
for(int i=0; i != *(p+i); i++){
return i;
}
}
