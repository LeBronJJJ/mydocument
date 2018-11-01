#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#define Row 11
#define Col 11
    void open_zero();
    char game_board[Row][Col];
    char fake_board[Row][Col];

    void Init()
    {
        int row,col;
    memset(game_board, 'M' ,121);
    for(row = 1; row <= Row - 2; ++ row)
    {
        for(col = 1; col <= Col - 2; ++ col)
        {
            game_board[row][col] = '0';
        }
    }
    memset(fake_board, ' ' ,121);
    }

    void prt_map()
{
  int row;
   for (row = 0; row < Row; ++row)
  {
        printf("|  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |\n",
               game_board[row][0],game_board[row][1],game_board[row][2],
               game_board[row][3],game_board[row][4],game_board[row][5],
               game_board[row][6],game_board[row][7],game_board[row][8],
               game_board[row][9],game_board[row][10]);
        printf("-------------------------------------------------------------------\n");
    }
}
 void prt_final_map()
{
  int row;
   for (row = 1; row <= Row - 2; ++row)
  {

        printf("|  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |\n",
               game_board[row][1],game_board[row][2],
               game_board[row][3],game_board[row][4],game_board[row][5],
               game_board[row][6],game_board[row][7],game_board[row][8],
               game_board[row][9]);
        printf("-------------------------------------------------------\n");
    }
}




    void prt_player_map()
{
    int row;
    printf("       01    02    03    04    05    06    07    08    09\n");          //4
    for (row = 1; row <= 9; ++row)

    {
        printf("%02d   |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |\n",     //通过%02  输出的1会自动补0变为两位01
               row,fake_board[row][1],fake_board[row][2],                                     //而10依旧是二位数10
               fake_board[row][3],fake_board[row][4],fake_board[row][5],
               fake_board[row][6],fake_board[row][7],fake_board[row][8],
               fake_board[row][9]);
        printf("     -------------------------------------------------------\n");
    }
}

    void plus_one (int row ,int col)
    {
        int row0;
        int col0;
        for(row0 = row -1; row0 <= row +1; ++row0)
        {
            for(col0 = col -1; col0 <= col +1; ++col0)
        {
            if (game_board[row0][col0] == 'M')
            {
                continue;
            }
           if(game_board[row0][col0] != '0')
            {
                game_board[row0][col0] += 1;
            }
           if(game_board[row0][col0] == '0')
            {
                game_board[row0][col0] = '1';
            }
        }
        }
    }

    void set_mine(int PlayerSelect)
{
    int row,col;

    while(1)
    {
        if(PlayerSelect > 0 && PlayerSelect <=81)
        {
             row=rand()%9+1;
            col=rand()%9+1;
            while (game_board[row][col] == 'M')
            {
             row=rand()%9+1;
             col=rand()%9+1;
            }
            game_board[row][col] = 'M';
            plus_one(row,col);
            PlayerSelect--;
        }
        if (PlayerSelect < 0 || PlayerSelect > 81)
        {
            printf("输入有误！\n");
            break;
        }
        if (PlayerSelect == 0)
        {
            break;
        }
    }
}
    void updata_map (int row, int col)
    {

        if (game_board[row][col] == 'M')
        {
            printf("Game Over!\n");
            exit(0);
        }
        if (game_board[row][col] != 'M' &&game_board[row][col] != '0')
        {
            fake_board[row][col] = game_board[row][col];
        }
        if (game_board[row][col] == '0')
        {
            open_zero(row,col);
        }
    }

    void open_zero(int row,int col)
    {
        int rowl,coll;
        fake_board[row][col] = game_board[row][col];
        if (game_board[row][col] == '0' )
    {
        for(rowl = row - 1; rowl <= row + 1; ++rowl)
        {
            for(coll = col - 1; coll<= col + 1; ++ coll)
            {
                if(fake_board[rowl][coll] == '0')
               {
                   continue;
               }
                    open_zero(rowl,coll);
            }

        }
    }
    }
     int  IsWin(int PlayerSelect)
    {
        int sum = 81,num = 0;
        for(int row = 1; row <= Row - 2; ++ row)
        {
            for(int col = 1; col <= Col - 2; ++col)
            {
                if(fake_board[row][col] != ' ')
                {
                    ++num;
                }
            }
        }
        if (num == sum - PlayerSelect)
        {
            return 0;
        }
        return 1;
    }
    void menu()
    {
        int choice;
        printf("***************************************************************************\n");
        printf("                              find  mine                                                       \n");
         printf("***************************************************************************\n");
         printf("please push 1 or 0 button to chose:\n");
         printf("1.start the game.\n0.exit.\n");
         while(1)
         {
             scanf("%d",&choice);
             if (choice == 1)
             {
                 break;
             }
             if(choice == 0)
             {
                 exit(0);
             }
             else
             {
                 printf("please push 1 or 0 button:\n");
         printf("1.start the game.\n0.exit.\n");
                 continue;
             }
         }

    }

    int main ()
    {

        srand(time(NULL));
        int PlayerSelect,row,col;
        Init();
        menu();

        printf("请输入想要创建的地雷数量:\n");
        scanf("%d",&PlayerSelect);
//        prt_player_map();
//        set_mine(PlayerSelect);
//        printf("请输入坐标！");
//        scanf("%d %d",&row,&col);
//        updata_map(row,col);
//

//        prt_map();
        set_mine(PlayerSelect);
    while (1)
    {
      prt_player_map();
      printf("请输入坐标！");
      scanf("%d %d",&row,&col);
      system("cls");
      updata_map(row,col);
      IsWin(PlayerSelect);
      if (IsWin(PlayerSelect) == 0)
      {
          printf("恭喜您获得了胜利！\n");
       prt_final_map();
          break;
      }
    }
        getchar();
        getchar();
        return 0;
    }


