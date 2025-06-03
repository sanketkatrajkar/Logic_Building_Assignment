///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java 
// Description :  Accept the Rows and columns from the user and display the given pattern.
// Author      :  Sanket Ashok Katrajkar
// Date        :  03/06/2025
///////////////////////////////////////////////////////////////////////////////

/*
    Input : iRow = 4, iCol = 4
    Output:  *  *  *  #  
             *  *  #  *  
             *  #  *  * 
             #  *  *  *        
*/


import java.util.*;

class Pattern
{
    public void Display(int iRow , int iCol)
    {
         int i = 0, j = 0;

         if(iRow != iCol)
        {
            System.out.println("Invalid input");
            return;
        }

         for(i = 1; i <= iRow; i++)
         {
            for(j = iCol; j >= 1; j--)
            {
               if(j == i)  
               {
                    System.out.print("# \t");
               }
               else
               {
                System.out.print("* \t");
               }
               
            }

            System.out.println();
         }
    }

}


public class program1
{
    public static void main(String args[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number of Rows and columns :");

        iValue1 = sobj.nextInt();
        iValue2 = sobj.nextInt();
        
        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);

    }   
}

