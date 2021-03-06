public class Class2 {
	  public static void main(String[]args) {
	    final int TABLE_SIZE = 12;
	    // Declare the rectangular array to store the multiplication table:
	    int[][] table = new int[TABLE_SIZE][TABLE_SIZE];

	    // Fill in the array with the multiplication table:
	    for(int i = 0 ; i < table.length ; ++i) {
	      for(int j = 0 ; j < table[i].length ; ++j) {
	        table[i][j] = (i+1)*(j+1);
	      }
	    }

	    // Output the table heading
	    System.out.print("      :");             // Row name column heading
	    for(int j = 1 ; j <= table[0].length ; ++j) {
	      System.out.print((j<10 ? "   ": "  ") + j);
	    }
	    System.out.println("\n-------------------------------------------------------");

	    // Output the table contents
	    // Each entry in the table should be four characters wide so we output
	    // three spaces preceding values less than 10, two spaces preceding values
	    // from 10 to 99 and one space for values exceeding 100.
	    // This exercise would be much easier if you know about the printf() method
	    // that you'll see in detail in Chapter 8.
	    for(int i = 0 ; i < table.length ; ++i) {
	      System.out.print("Row" + (i<9 ? "  ":" ") + (i+1) + ":");

	      for(int j = 0; j < table[i].length; ++j) {
	        System.out.print((table[i][j] < 10 ? "   " : table[i][j] < 100 ? "  " : " ") + table[i][j]);
	      }
	      System.out.println();
	    }
	  }
	}
