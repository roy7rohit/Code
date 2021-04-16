 #include<stdio.h>
 typedef struct complex{
 float real;
 float img;
 }complex_num;
 
 complex_num add(complex_num n1, complex_num n2);
 void main(){
 complex_num n1, n2, result;
 printf("first complex no :");
 scanf("%f %f", &n1.real, &n1.img);
 printf("second complex no :");
 scanf("%f %f", &n2.real, &n2.img);
 
 result = add(n1, n2);
 printf("sum = %.1f + %.1fi", result.real, result.img);
 }
 
 complex_num add(complex_num n1, complex_num n2){
 complex_num temp;
 temp.real = n1.real + n2.real;
 temp.img = n1.img + n2.img;
 return temp;
 }
