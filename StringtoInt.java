/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtoint;

import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class StringtoInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
        double n=0,c=0;int d=0,j,f;System.out.println("Enter the String   ");
            String s1=s.nextLine();
            int w=s1.length();
            for(int i=0;i<w;i++){
                char a=s1.charAt(i);
                 f=(int)a;
                 d=f-48;System.out.println("After Convert  "+d);
        }
    }
}

