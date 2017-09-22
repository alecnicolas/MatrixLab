//Alec Marcum
//COMP 182 TuTh 12:30-3:15

package matrix;
import java.util.*;

public class MatrixDriver 
{
    public static void main(String[] args) 
    {
        //User Variables
        Matrix myMat = getInp();
        Matrix urMat = getInp();
        int ourOp = getUserOp();
        
        //Checks User Input
        boolean validOp = checkOp(myMat, urMat, ourOp);
        
        //Prints Answer
        if(validOp)
        {
            ourMatrix(myMat,urMat,ourOp);
        }
        //Starts over if input is invalid
        else
        {
            main(null);
        }
        
        //Starts over if user wishes
        keepGoing();
    }

    //Gets user input for matrix
    public static Matrix getInp()
    {
     return new Matrix(getRow(),getCol());
    }
    
    public static int getRow()
    {
     Scanner in = new Scanner(System.in);
     int x;

     System.out.print("Please enter how many rows: ");
     x = in.nextInt();
     
     return x;
    }
     
    public static int getCol()
    {
     Scanner in = new Scanner(System.in);
     
     int y;
 
     System.out.print("Please enter how many columns: ");
     y = in.nextInt();
     
     return y;
    }
     
    public static int getUserOp()
    {
        Scanner in = new Scanner(System.in);
        int o = 0;
 
        System.out.print("Which operation would you like to use? \n 1. Add \n 2. Subtract \n 3. dotProduct \n 4. Hadamard \nSelect number from 1-4: ");
        o = in.nextInt();
        
        return o;
    }
    
    
    //Checks that user input compatible operation
    public static boolean checkOp(Matrix A, Matrix B, int op) //checks Operation with validate
    {
        boolean opValid;
        if(!validate(A, B, op))
        {
            System.out.print("Invalid input! Make sure you choose a number from 1-4 and that the operation is compatible with your dimensions \n");
            return opValid = false;
        }
        return opValid = true;
    }
    
    public static boolean validate(Matrix A, Matrix B, int op) //checks dimensions of matrices
    {
        boolean valid;
        
        if(op==3)
        {
            if(A.row == B.col || A.col == B.row)
            {
                return valid = true;
            }
            
            else
            {
                return valid = false;
            }
        }
        else if(op>0 && op<5)
        {
            if(A.row == B.row && A.col == B.col)
                {
                    return valid=true;
                }
            else
            {
                return valid = false;
            }
        }
        else
        {
            return valid = false;
        }
        
    }
    
    //
   
    //Calculates new matrix
    public static String ourMatrix(Matrix A, Matrix B, int op)
    {
        String opr = "";
        
        switch(op)
        {
            case 1: opr = "You added these";
            case 2: opr = "You subtracted these";
            case 3: opr = "You used dotProduct for these";
            case 4: opr = "You used Hadamard for these";
        }
        
        System.out.println(opr + "\n1)\n" + A + "\n" + "2)\n" + B + "\nCreated Matrix:\n" + result(A,B,op));
        return null;
    }
    
    public static Matrix result(Matrix A, Matrix B, int op)
    {
        switch(op)
        {
            case 1:
                return A.add(B);
            case 2:
                return A.sub(B);
            case 3:
                return A.dotProduct(B);
            case 4:
                return A.hadamard(B);
        }
        return null;
    }
    
    //Gives user option to start over
    public static void keepGoing()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to keep going? Y/N");
        
        char res = in.next().charAt(0);
        
        if(res=='Y' || res=='y')
        {
            main(null);
        }
        else if(res=='n' || res=='N')
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Please enter Y or N");
            keepGoing();
        }
    }
}
