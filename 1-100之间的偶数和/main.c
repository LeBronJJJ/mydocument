#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*int i;
    int sum = 0;
    for(i = 0 ; i<100 ; i = i + 2)
  {
        sum = sum + i;
  }
    printf("1-100的偶数和为：%d",sum);
    */
    int i;
    int sum = 0;
    for(i = 0;i<=100;i++)
    {
        if(i % 2 != 0)
            continue;
        sum = sum + i;
    }
    printf("1-100的偶数和为：%d",sum);

    return 0;
}
