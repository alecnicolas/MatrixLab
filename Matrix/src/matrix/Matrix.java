package matrix;

import java.util.*;

public class Matrix
{
   //Fields
   int col;
   int row;
   int[][] elements;
   
   
   //Constructors
   public Matrix()
   {
      this.row=2;
      this.col=2;
      this.elements=new int[row][col];
      populate(-100,100);
      
   }  
   public Matrix(int col,int row)
   {
      this.row=row;
      this.col=col;
      this.elements=new int[row][col];
      populate(-100,100);
      
   }
   public Matrix(int[][]otherElements)
   {
      this.row=otherElements.length;
      this.col=otherElements[0].length;
      
      this.elements=otherElements.clone();
   } 
   private void populate(int min, int max)
   {
      Random randnum = new Random();
      for(int i=0;i<row;i+=1)
      {
         for(int j=0; j<col;j+=1)
         {
            this.elements[i][j]=randnum.nextInt(max-min+1)+min;
         }
      }
   }
   public Matrix add(Matrix om)
   {
      int[][]result=new int[row][col];
      for(int i=0;i<row; i+=1)
      {   
         for(int j=0;j<col;j+=1)
         {
            result[i][j]=elements[i][j]+om.elements[i][j];
         }
      }
      return new Matrix(result);
   }
   
   public Matrix sub(Matrix om)
   {
      int[][]result=new int[row][col];
      for(int i=0;i<row; i+=1)
      {   
         for(int j=0;j<col;j+=1)
         {
            result[i][j]=elements[i][j]-om.elements[i][j];
         }
      }
      return new Matrix(result);
   }
      
   public Matrix dotProduct(Matrix om)
   {
      int[][]result=new int[row][om.col];
      for(int i=0;i<this.row;i+=1)
      {
         for(int j=0;j<om.col;j+=1)
         {
            for(int k=0;k<this.col;k+=1)
            {
               result[i][j]+=this.elements[i][k]*om.elements[k][j];
            }
     
         }
      }
       return new Matrix(result);
   }
   
   public Matrix hadamard(Matrix om)
   {
       int[][]result = new int[row][col];
       for (int i=0;i<this.row;i+=1)
           for(int j=0; j<this.col; j+=1)
           {
               result[i][j]=this.elements[i][j]*om.elements[i][j];
           }
       return new Matrix(result);
   }
   
   @Override
   public String toString()
   {
       String result="";
       
       for(int[] row:this.elements)
       {
           for(int j:row)
           {
               result +=" "+j+" ";
           }
           result +="\n";
       }
       return result;
   }
   
   @Override
   public Matrix clone()
   {
      return new Matrix(this.elements.clone());
   }
}        