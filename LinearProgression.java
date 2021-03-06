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
      
      S1 = S2 = S3 = S4 = S5 = 0;
      
      for (int i = 0; i < N; i++) {
         S1+=x[i];
         S2 += y[0][i];
         S3 += x[i] * y[0][i];
         S4 += x[i] * x[i];
         S5 += y[0][i] * y[0][i];
      }    
   
      T = S = B = R = 0;
      
      T = N * S4 - S1 * S1;
      S = (N * S3 - S1 * S2) / T;
      B = (S4 * S2 - S1 * S3) / T;
      R = (N * S3 - S1 * S2) /
         (Math.sqrt(Math.abs(((N * S4 - Math.pow(Math.abs(S1), 2)) * (N * S5 - Math.pow(Math.abs(S2), 2)))))); 
      
      //DecimalFormat formatter = new DecimalFormat("######################.0000000000000000");
      System.out.print("\n\n SLOPE = ");
      System.out.printf("%22.16f%n", S);
      
      System.out.print("\n\n INTERCEPT = ");
      System.out.printf("%22.16f%n", B);
      
      literl[1] = '+';
      if (Math.abs(B) != B)
         literl[1] = '-';
      
      System.out.print("\n\n EQUATION FOR THE BEST FIT IS : ");
      BBAR = Math.abs(B);
      
      System.out.print(" Y(X) =");
      System.out.printf("%25.16f", S);
      System.out.print(" * X" + literl[1]);
      System.out.printf("%25.16f%n%n%n", BBAR);
      
      System.out.print(" LINEAR CORRELATION COEFFICIENT = ");
      System.out.printf("%22.16f%n", R);
      
      System.out.print("LINEAR... Execution completed");   
   }
   
}
