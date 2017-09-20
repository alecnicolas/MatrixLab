/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author anm14646
 */
public class MatrixDriver {

    public static void main(String[] args) {
        Matrix mtx = new Matrix();
        Matrix mtx2 = new Matrix();
        
        
        Matrix mtx3 = mtx.add(mtx2);
        System.out.println(mtx3.toString());
    }

}
