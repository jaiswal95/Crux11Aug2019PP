package L2_Aug17;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 17-Aug-2019
 *
 */

public class Pattern8 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;
		int col = 1;

		while (row <= n) {

			// work
			col = 1;
			while (col <= n) {

				if (row == col || row + col == n + 1)
					System.out.print("*");
				else
					System.out.print(" ");

				col++;
			}

			// prep
			row++;
			System.out.println();

		}

	}
}
