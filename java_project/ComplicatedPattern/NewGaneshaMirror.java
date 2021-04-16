package ComplicatedPattern;

public class NewGaneshaMirror {
    
  public static void main(String[] args) {

    revswastika(7, 7); 
    
  }
 

	static void revswastika(int row, int col) 
	{ 
		for (int i = 0; i < row; i++) 
		{ 
			for (int j = 0; j < col; j++) 
			{ 
				
				if (i < row / 2) 
				{ 
				
					if (j < col / 2) 
					{ 
						 
						if (i == 0 && i < row / 2) 
							System.out.print("*" + " "); 
							
					
						else
							System.out.print(" " + " "); 
					} 
					
					
					else if (j == col / 2) 
					System.out.print("*"); 
					else
					{ 
						if (i < row / 2 && j < col - 1) 
							System.out.print(" " + " "); 
						if (j == col - 1) 
						
						
							System.out.print(" " + "*"); 
					} 
				} 
		
			
				else if (i == row / 2) 
					System.out.print("*" + " "); 
				else
				{ 
					 
					if (j == col / 2 || j == 0) 
						System.out.print( "*" + " "); 
					else if (i == row - 1) 
					{ 
						
						if (j <= col / 2 || j == col) 
							System.out.print (" " + " "); 
						else
							System.out.print("*" + " "); 
					} 
					
					else
					System.out.print(" " + " "); 
				} 
			} 
			System.out.println(); 
		} 
	} 
}