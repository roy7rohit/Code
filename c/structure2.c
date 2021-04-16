#include<stdio.h>
struct distance{
int feet;
float inch;
}distance1, distance2, sumOfDistances;
void main(){

printf("enter the distance of 1st: ");
scanf("%d %f", &distance1.feet, &distance1.inch);

printf("enter the distance of 2nd : ");
scanf("%d %f", &distance2.feet, &distance2.inch);

sumOfDistances.feet = distance1.feet + distance2.feet;
sumOfDistances.inch = distance1.inch + distance2.inch;

if (sumOfDistances.inch>12.0) {
        sumOfDistances.inch = sumOfDistances.inch-12.0;
        ++sumOfDistances.feet;
}
printf("\nSum of distances = %d\'-%.1f\"", sumOfDistances.feet, sumOfDistances.inch);
   
}

