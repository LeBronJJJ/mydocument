#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main()
{
    /*int x, y;
    printf("请输入x与y的值以进行比较：\n");
    scanf("%d%d",&x,&y);
    if (x - y < 0)
    {
        printf("%d  %d",y,x);
    }
    else if(x - y == 0)
    {
        printf("x = y");
    }
    else
    {
        printf("%d  %d",x,y);
    }
    */


    //比较xyz的 大小  1. 由小到大排序  2.输出最大值
    //冒泡排序法

    /*int x, y, z;
    printf("请输入xyz的值用以比较大小：");
    scanf("%d%d%d",&x,&y,&z);
    int nums[ 3 ] = { x,y,z };
    int i, j ,temp;
    //外层循环  控制轮数
    for(i = 0; i < 2; i++)
    {
        //内层循环控制每轮的比较次数
        for(j = 0; j < 2 - i; j ++)
        {
            //如果当前值小于后面的一个值，就交换
            if(nums[j] > nums[j + 1])
            {
                temp =  nums[j];
                nums[j] =  nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }
    printf("排序后的结果是： \n");
    for(i = 0; i < 3; i++)
    {
        printf("%d\t",nums[i]);
    }
    printf("最大值为%d\n",nums[2]);
    */

     //输出小写英文字母的大写


    /*char a;
    printf("请输入小写字母:");
    scanf("%c",&a);
    printf("转换成大写字母为：%c\n",a-32);
    */



    //任意输入工作时间  输出工资

    /*float time, money;
    printf("请输入工作时间：");
    scanf("%f",&time);
    if (time <= 60 )
    {
        money = time * 10;
        printf("工资为：%.2f元",money);
    }
    else
    {
        money = 600 + (time - 60) * 20;
        printf("工资为：%.2f元",money);
    }
    */



    //输入一个实数分别输出其整数和小数部分
    /*
    double num;
    printf("请输入一个实数以分别输出其整数和小数部分：\n");
    scanf("%lf",&num);
    printf("整数部分：%.0lf  小数部分：%lf",floor(num),num - floor(num));   //floor这个函数作用是去掉小数点后的数并取整
    */


    //判断x y  x是否能被y整除

    /*
    int x, y;
    printf("请输入xy的值以判断x是否能被y整除：\n");
    scanf("%d%d",&x,&y);
    if (y % x == 0)
    {
        printf("x 能被 y 整除！");
    }
    else
    {
        printf("x 不能被 y 整除！");
    }

    */


    //拆解四位整数
    //如  1596   1.5.9.6
   /* int num,i;
    printf("请输入需要拆解的四位整数！：\n");
    scanf("%d",&num);

    for (i = 3; i>=0;i--)
    {
        int mo=(int)pow(10,i);
        int temp=(int)(num / mo);
        printf("%d\t",temp);
        num=num-(temp*mo);
    }
*/

        //8.判断是否为闰年

      /*  int a = 2000, year;
        while(1)

        {
            printf("请输入年份用以判断是否为闰年：\n");
            scanf("%d",&year);
            if ((year - a) % 4 == 0)
        {
            printf("yes!\n");
        }
            else
        {
            printf("No!\n");
        }
        }
        */

        //9.输入长宽，如果矩形面积不小于10 和周长不大于 30  输出 ： right 并输出面积周长   反之 输出: no


       /* int chang , kuan ,s,c;
        printf("请输入长与宽：\n");
        scanf("%d%d",&chang,&kuan);
        s = chang * kuan;
        c = (chang + kuan) * 2;

        if(s > 10 && c < 30)
        {
            printf("right!\n 面积：%d周长：%d",s,c);
        }
        else
        {
            printf("no!");
        }

        */

        //10. 计算x^4-10的值，用变量y接受  如果y小于0  输出 NULL  反之输出结果

        float x,y;
        printf("input x :\n");
        scanf("%f",&x);
        y = x*x*x*x - 10;
        if ( y < 0)
        {
            printf("NULL!");
        }
        else
        {
            printf("%.2f",y);
        }









    return 0;

}
