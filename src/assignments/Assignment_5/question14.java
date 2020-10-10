package assignments.Assignment_5;

public class question14 {

	public static void main(String[] args) {
		/*
		 * Question-14:
		 * Write nested loop to draw this pattern

			##
			# #
			#  #
			#   #
			#    #
			#     #
			#      #
		 */

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i+1; j++) {
				if(j==1 || j==i+1)
					System.out.print("#");
				else
					System.out.print(" ");
				
				// for single line ternary code
				// System.out.print((j==1 || j==i+1) ? "#" : " ");
			}
			System.out.println();
		}
	}
}
