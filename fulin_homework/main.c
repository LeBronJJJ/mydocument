#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main()
{
    /*int x, y;
    printf("������x��y��ֵ�Խ��бȽϣ�\n");
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


    //�Ƚ�xyz�� ��С  1. ��С��������  2.������ֵ
    //ð������

    /*int x, y, z;
    printf("������xyz��ֵ���ԱȽϴ�С��");
    scanf("%d%d%d",&x,&y,&z);
    int nums[ 3 ] = { x,y,z };
    int i, j ,temp;
    //���ѭ��  ��������
    for(i = 0; i < 2; i++)
    {
        //�ڲ�ѭ������ÿ�ֵıȽϴ���
        for(j = 0; j < 2 - i; j ++)
        {
            //�����ǰֵС�ں����һ��ֵ���ͽ���
            if(nums[j] > nums[j + 1])
            {
                temp =  nums[j];
                nums[j] =  nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }
    printf("�����Ľ���ǣ� \n");
    for(i = 0; i < 3; i++)
    {
        printf("%d\t",nums[i]);
    }
    printf("���ֵΪ%d\n",nums[2]);
    */

     //���СдӢ����ĸ�Ĵ�д


    /*char a;
    printf("������Сд��ĸ:");
    scanf("%c",&a);
    printf("ת���ɴ�д��ĸΪ��%c\n",a-32);
    */



    //�������빤��ʱ��  �������

    /*float time, money;
    printf("�����빤��ʱ�䣺");
    scanf("%f",&time);
    if (time <= 60 )
    {
        money = time * 10;
        printf("����Ϊ��%.2fԪ",money);
    }
    else
    {
        money = 600 + (time - 60) * 20;
        printf("����Ϊ��%.2fԪ",money);
    }
    */



    //����һ��ʵ���ֱ������������С������
    /*
    double num;
    printf("������һ��ʵ���Էֱ������������С�����֣�\n");
    scanf("%lf",&num);
    printf("�������֣�%.0lf  С�����֣�%lf",floor(num),num - floor(num));   //floor�������������ȥ��С����������ȡ��
    */


    //�ж�x y  x�Ƿ��ܱ�y����

    /*
    int x, y;
    printf("������xy��ֵ���ж�x�Ƿ��ܱ�y������\n");
    scanf("%d%d",&x,&y);
    if (y % x == 0)
    {
        printf("x �ܱ� y ������");
    }
    else
    {
        printf("x ���ܱ� y ������");
    }

    */


    //�����λ����
    //��  1596   1.5.9.6
   /* int num,i;
    printf("��������Ҫ������λ��������\n");
    scanf("%d",&num);

    for (i = 3; i>=0;i--)
    {
        int mo=(int)pow(10,i);
        int temp=(int)(num / mo);
        printf("%d\t",temp);
        num=num-(temp*mo);
    }
*/

        //8.�ж��Ƿ�Ϊ����

      /*  int a = 2000, year;
        while(1)

        {
            printf("��������������ж��Ƿ�Ϊ���꣺\n");
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

        //9.���볤��������������С��10 ���ܳ������� 30  ��� �� right ���������ܳ�   ��֮ ���: no


       /* int chang , kuan ,s,c;
        printf("�����볤���\n");
        scanf("%d%d",&chang,&kuan);
        s = chang * kuan;
        c = (chang + kuan) * 2;

        if(s > 10 && c < 30)
        {
            printf("right!\n �����%d�ܳ���%d",s,c);
        }
        else
        {
            printf("no!");
        }

        */

        //10. ����x^4-10��ֵ���ñ���y����  ���yС��0  ��� NULL  ��֮������

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
