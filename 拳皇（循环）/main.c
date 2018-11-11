#include <stdio.h>
#include <stdlib.h>//标准库
#include <time.h>   //time()
#include <windows.h> //Sleep

int main()
{
        //随机函数
        srand(time(NULL));//使用时间作为种子，产生不一样的随机数字
        //rand()函数的取值范围是0-32767
        printf("随机数字%d\n",rand());
        //使用循环模拟实现玩家对战
        //双方初始生命值为100
        //每次攻击5-15
        //HP最先到0或以下的被KO

        int HP1 = 100, HP2 = 100;       //1p和2p的初始血量
        int att1, att2;
        int i = 0;//对战的轮数
        while(HP1 >=0 && HP2 >=0)    //当两者都活着的时候
    {
            //默认1p首先攻击
            att1 = rand() % 11 + 5;//5-15之间的攻击力
            printf("**********************************************\n");

            if(att1 == 15)//暴击
                {
                    att1 *= 2;
                    printf("暴击！\n");
                }
            att2 = rand() % 11 + 5;//同理
            if(att2 == 15)
            {
            att2 *= 2;
            printf("暴击！\n");
            }
            HP2 -= att1;//玩家1攻击，2p掉血
            HP1 -= att2;//同理
            //建议两个人打完立即if判断，血量少于0的立即判定为输
            printf("第%d轮\n", i+1);
            printf("玩家1攻击力：%d,玩家2剩余血量：%d\n",att1, HP2);
            printf("玩家2攻击力：%d,玩家1剩余血量：%d\n",att2, HP1);
            printf("**********************************************\n");
            Sleep(200);
            i++;

    }
    if(HP1 <= 0 && HP2 <= 0)
    {
            printf("平局！玩家1的血量：%d\t玩家2的血量：%d\n",HP1,HP2);

    }
    if(HP1 > 0 && HP2 <= 0)
    {
        printf("Player1 won!玩家1的血量：%d\t玩家2的血量：%d\n",HP1,HP2);
    }
    if(HP1 <= 0 && HP2 > 0 )
    {
        printf("Player2 won!玩家1的血量：%d\t玩家2的血量：%d\n",HP1,HP2);
    }




        return 0;
}
