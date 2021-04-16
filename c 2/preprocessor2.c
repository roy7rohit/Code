#include<stdio.h>
#define country india
#if country == pakistan
   printf("pakistani");
#elif country == bangladesh
   printf("bangladeshi");
#elif country == nepal
   printf("nepali");
#else
   printf("indian");
#endif
