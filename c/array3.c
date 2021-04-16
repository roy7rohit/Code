#include<stdio.h>
void main(){
int twoD[4][5] , i, j, k = 0;

for(i=0; i<4; i++){
              for(j=0; j<5; j++){
              
              twoD[i][j] = k;
              k++;
              }
}

for(i=0; i<4; i++){
              for(j=0; j<5; j++){
              
            //  printf("%d\n %d\n %d\n", i+1, j+1, twoD[i][j]);
            printf("%d\n", i+1);
            printf("%d\n", j+1);
            printf("%d\n", twoD[i][j]);
            
              }
}
}
