#include<stdio.h>
struct book{
int book_id;
char book_title[20];
float book_price;
};
struct book input();

void main(){
struct book b1;
input(b1);
printf("%d %s %f ", b1.book_id, b1.book_title, b1.book_price);
}
struct book input(){
struct book b;
printf("enter the book record :");
scanf("%d\n", &b.book_id);
fgets(b.book_title, 20, stdin);
scanf("%f\n", &b.book_price);
return b;
}
 
