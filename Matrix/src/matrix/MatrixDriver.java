package matrix;
import java.util.*;


public class MatrixDriver {

    public static void main(String[] args) 
    {
        //User Variables
        Matrix myMat = getInp();
        Matrix urMat = getInp();
        int ourOp = getUserOp();
        
        //Checks User Input
        boolean checkOp = checkOp(myMat, urMat, ourOp);
        
        
        
        //Testing
        System.out.println(myMat.toString() + "\n");
        System.out.println(urMat.toString());
        
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

     System.out.print("Please enter how many rows ");
     x = in.nextInt();
     
     return x;
    }
     
    public static int getCol()
    {
     Scanner in = new Scanner(System.in);
     
     int y;
 
     System.out.print("Please enter how many columns ");
     y = in.nextInt();
     
     return y;
    }
     
    public static int getUserOp()
    {
        Scanner in = new Scanner(System.in);
        int o = 0;
 
        System.out.print("Which operation would you like to use? \n 1. Add \n 2. Subtract \n 3. dotProduct \n 4. Hadamard \n");
        o = in.nextInt();
        
        return o;
    }
    
    public static boolean checkOp(Matrix A, Matrix B, int op) //checks Operation with validate
    {
        boolean opValid;
        if(!validate(A, B, op))
        {
            System.out.print("Invalid input \n");
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
}
