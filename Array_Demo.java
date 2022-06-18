/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_demo;

/**
 *
 * @author hadee
 */
public class Array_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] num={{4,5,7},{0},{3,8,6,7}};
        
        for( int i=0 ; i<num.length;i++){
            
    for(int j =0;j<num[i].length;j++){
        System.out.print(num[i][j]+ "\t");
        }
    System.out.println();
    }
    }
    
}


