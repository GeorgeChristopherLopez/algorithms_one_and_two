import java.util.*;
public class Percolation {
    
	// grid  open 1 closed 0 full 2
	private int[][] grid;
	private int[][] connections;
	private int top;
	private int bottom;	
	private int N;
	private int numOpen;

	// creates n-by-n grid, with all sites initially blocked
	public Percolation(int n){
	N = n;
	numOpen = 0;
	int[][] grid = new int [n][n];
	int[][] connections = new int [n][n];
	// print grid for testing
	for(int i = 0; i < N; i++) {
		for(int j = 0; j < N; j++){
	  		System.out.print(grid[i][j]+" ");
		}
	System.out.println();
	}
	}

	// opens the site (row, col) if it is not open already
	public void open(int row, int col) {
		/*if(row > N-1 || col > N-1 || row < 0 || col < 0)
		throw IllegalArgumentException();*/

		if(grid[row][col] == 0){
  			grid[row][col] = 1;
			numOpen++;
		}
	}

	// is the site (row, col) open?
    	public boolean isOpen(int row, int col) {
		
		return grid[row][col] == 1;
    	}

	// is the site (row, col) full?
    	public boolean isFull(int row, int col) {
		return grid[row][col] == 3;
	}

	// returns the number of open sites
	public int numberOfOpenSites(){
		return numOpen;
    	}

	// does the system percolate?
	public boolean percolates() {	
		// grid.connected(top, bottom);
		return false;
    	}
	
	public void printGrid(){
		// print grid for testing
	for(int i = 0; i < N; i++) {
		for(int j = 0; j < N; j++){
	  		System.out.print(grid[i][j]+" ");
		}
	System.out.println();
	}
	}

	// test client (optional)
	public static void main(String[] args) {

		// implementing weighted quick union
		Percolation P = new Percolation(5);
		
		Random rand = new Random();
		// random sites
		int x = 0;
		while( x != 10){
			int p1 =  rand.nextInt(5); 
			int p2 =  rand.nextInt(5); 
			System.out.println("union of " + p1 + " "+p2); 
			x++;				
		}
		
	}
}