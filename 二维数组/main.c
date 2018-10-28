#include <stdio.h>
#include <stdlib.h>

int main()
{
        int i, j;
        double scores[4][3] =
        {
        {78, 89, 99},
        {77, 56, 78},
        {68, 67, 88},
        {77, 54, 71}
        };
        printf("ÓïÎÄ\tÊıÑ§\tÓ¢Óï\n");
        for(i = 0; i < 4; i++)
        {
            for(j = 0; j < 3; j++)
            {
                printf("%-8.0lf",scores[i][j]);
            }
            printf("\n");
        }


    return 0;
}
