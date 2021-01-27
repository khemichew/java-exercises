import java.util.Scanner;

/* 
  Attempt for Integral Pyramid problem, which can be found at https://www.doc.ic.ac.uk/~aen917/ppt/ProblemI.pdf

  Pascal’s triangle is a marvel of the combinatorical world, and what’s more you can easily build one for yourself at home.
  The lowest row has n numbers. The next row is staggered and has n-1 numbers, where the ith is the sum of the ith and ith 
  and the (i+1)th on the previous row. 

  You can choose any positive integers for the lowest row, but the single cell on the top row needsto be equal to a given x. 
  Is this possible?
*/ 

public class IntegralPyramid {

  public static void main(String[] args) {
    int n;
    int x;
    final Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    x = scanner.nextInt();

    integralPyramid(n, x);
  }

  static void integralPyramid(int n, int x) {
    final int last = x - ((int) Math.pow(2, n - 1) - 1);

    if (last <= 0) {
      System.out.println("impossible");
    } else {
      for (int row = n - 1; row >= 0; row--) {
        for (int col = 0; col < n - row - 1; col++) {
          System.out.print(Math.pow(2, row));
          System.out.print(" ");
        }
        System.out.println(last + (int) Math.pow(2, row) - 1);
      }
    }
  }
}
