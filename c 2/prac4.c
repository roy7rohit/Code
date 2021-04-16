#include<stdio.h>
void main(){
/*int i = 9, j = 7, *p, *q;
p = &i;
q = &j;
*p = *q;
printf("%d\n%d\n", *p, *q);
}*/

int i = 1, *p, *q;
p = &i;
q = p;
*q = 5;
printf("%d\n", *p);
}
