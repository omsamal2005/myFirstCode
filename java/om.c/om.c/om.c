#include<stdio.h>
int main()
{
    int a,b,temp;
    printf("Enter the numbers");
    scanf("%d%d",&a,&b);
    temp=a;
    b=a;
    b=temp;
    printf("%d %d",a,b);
    return 0;



}