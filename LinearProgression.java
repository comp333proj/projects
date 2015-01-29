/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linearprogression.LinearProgression;

import java.util.Scanner;
/**
 *
 * @author Shant
 */
public class LinearProgression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] x;
        double[][] y;
        char[] literl;
        double S1,S2,S3,S4,S5,T,S,B,R,BBAR;
        int N;
        x = new double[50];
        y = new double[50][50];
        literl = new char[2];
        System.out.print(" * * * Linear Regression Analysis * * *\n\n");
        System.out.print(" How many pairs to be analyzed? ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        if(N>50){
            System.out.print(" At present this program can only handle 50 data pairs");
            return;
        }
        System.out.print("\n\n Enter one pair at a time");
        System.out.print(" and seperate X from Y with a comma\n\n");
        System.out.print(" Enter pair one: ");
        String pair;
        String p[];
        pair = sc.nextLine();
        p = pair.split(",");
        x[0]=Double.parseDouble(p[0]);
        y[0][0]=Double.parseDouble(p[1]);
        for(int i=1;i<N;i++){
            System.out.print(" Enter pair number "+(i+1)+": ");
            pair = sc.nextLine();
            p = pair.split(",");
            p = pair.split(",");
            x[i]=Integer.parseInt(p[0]);
            y[0][i]=Double.parseDouble(p[1]);
            
        }
        System.out.print(" Would you  like to print the data? ");
        literl[0] = sc.nextLine().charAt(0);
        if(literl[0]=='Y'){
            for(int i=0;i<N;i++){
                System.out.print(" Data pair "+(i+1)+" "+x[i]+" "+y[0][i]+"\n");
            }
        }
        
        
 
        
        
        
    }
    
}
