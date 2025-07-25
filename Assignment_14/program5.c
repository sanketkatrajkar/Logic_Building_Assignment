///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept the Rows and columns from the user and display the given pattern.
// Author      :  Sanket Ashok Katrajkar
// Date        :  25/05/2025
///////////////////////////////////////////////////////////////////////////////

/*
    Input : iRow = 4, iCol = 4
    Output:   1   2   3  4
              2   3   4  5
              3   4   5  6
              4   5   6  7 
*/

#include<stdio.h>

void Display(int iRow, int iCol)
{
    int i = 0, j = 0;

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1; j <= iCol; j++)
        {
          printf("%d \t",i + j - 1);
        }
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter the number of Rows and Columns :\n");
    scanf("%d %d", &iValue1, &iValue2);

    Display(iValue1, iValue2);

    return 0;
}
