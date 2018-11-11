#include <stdio.h>
#include <stdlib.h>


//计算斐波那契数列的第n项
//用for和递归两种方法实现
/*int fib(int n)
{

    if (n == 1 || n == 2)
    {
        return 1;
    }
    return fib(n - 1) + fib(n - 2);
}

int main ()
{
    int n;
    scanf("%d",&n);
    printf("%d",fib(n));
}

*/


//  用for循环实现

int fib (int n)
{
    int i;
     int sum1 = 1;
    int sum2 = 1;
    int r = 2;
    if (n == 1 || n == 2)
    {
        return 1;
    }
    for(i = 3; i <= n; ++i)
    {
        r = sum1 + sum2;
        sum1 = sum2;
        sum2 = r;
    }
    return r;
}


int main ()
{
    int n;
    scanf("%d",&n);
    printf("%d",fib(n));
}




