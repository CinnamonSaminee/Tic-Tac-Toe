//Name: Samin Saberi
//Date: October 28th, 2013
//Description: A program that allows two users to play Tic-Tac-Toe.

import java.io.*;

class TwoDArrays1
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	//   0   1   2      this is the game board design
	//  ___ ___ ___     labelled with corresponding 
	//0|   |   |   |    array assignment
	// |___|___|___|
	//1|   |   |   |
	// |___|___|___|
	//2|   |   |   |
	// |___|___|___|
	
	//Variables: strings are used to identify winning possibilities
	//char array "board" represents a 3x3 game board
	String diaU, diaD, row1, row2, row3, col1, col2, col3;
	char[] [] board = new char [3] [3];

	//loop used to fill array with 'b' for blank
	for (int i = 0 ; i < board.length ; i++)
	{
	    for (int b = 0 ; b < 3 ; b++)
	    {
		board [i] [b] = 'b';
	    }
	}
	
	System.out.println("\t**Tic-Tac-Toe!**\n");
	//print game board
	System.out.println ("   1   2   3\n  ___ ___ ___ \n1| " + board [0] [0] + " | "
		+ board [0] [1] + " | " + board [0] [2] + " |\n |___|___|___|\n2| "
		+ board [1] [0] + " | " + board [1] [1] + " | " + board [1] [2]
		+ " |\n |___|___|___|\n3| " + board [2] [0] + " | " + board [2] [1]
		+ " | " + board [2] [2] + " |\n |___|___|___|\n");

	//**Initial Player X turn**
	System.out.println ("Player X: Please enter a row:");
	int row = Integer.parseInt (br.readLine ());    //collect selected row

	System.out.println ("Player X: Please enter a column:");
	int col = Integer.parseInt (br.readLine ());    //collect selected column

	while (!(row > 0 && row < 4 && col > 0 && col < 4 && board [(row - 1)] [(col - 1)] == 'b'))
	{ //test if row and column selected is valid
	    //collect new row and column if invalid
	    System.out.println ("\nThe chosen square is invalid!");
	    System.out.println ("Player X: Please enter a row:");
	    row = Integer.parseInt (br.readLine ());

	    System.out.println ("Player X: Please enter a column:");
	    col = Integer.parseInt (br.readLine ());
	}
	board [(row - 1)] [(col - 1)] = 'X';    //replace selected spot with X
	
	//print board
	System.out.println ("   1   2   3\n  ___ ___ ___ \n1| " + board [0] [0] + " | "
		+ board [0] [1] + " | " + board [0] [2] + " |\n |___|___|___|\n2| "
		+ board [1] [0] + " | " + board [1] [1] + " | " + board [1] [2]
		+ " |\n |___|___|___|\n3| " + board [2] [0] + " | " + board [2] [1]
		+ " | " + board [2] [2] + " |\n |___|___|___|\n");

	for (int i = 0 ; i < 4 ; i++)   //loop for remaining turns is repeated
	{                               //4 times to fill all spots of board
	    //**Player O turn**
	    System.out.println ("Player O: Please enter a row:");
	    row = Integer.parseInt (br.readLine ());    //collect selected row

	    System.out.println ("Player O: Please enter a column:");
	    col = Integer.parseInt (br.readLine ());    //collect selected column

	    while (!(row > 0 && row < 4 && col > 0 && col < 4 && board [(row - 1)] [(col - 1)] == 'b'))
	    { //test if row and column selected is valid
		//collect new row and column if invalid
		System.out.println ("\nThe chosen square is invalid!");
		System.out.println ("Player O: Please enter a row:");
		row = Integer.parseInt (br.readLine ());

		System.out.println ("Player O: Please enter a column:");
		col = Integer.parseInt (br.readLine ());
	    }
	    board [(row - 1)] [(col - 1)] = 'O';    //replace selected spot with O

	    //print board
	    System.out.println ("   1   2   3\n  ___ ___ ___ \n1| " + board [0] [0] + " | "
		    + board [0] [1] + " | " + board [0] [2] + " |\n |___|___|___|\n2| "
		    + board [1] [0] + " | " + board [1] [1] + " | " + board [1] [2]
		    + " |\n |___|___|___|\n3| " + board [2] [0] + " | " + board [2] [1]
		    + " | " + board [2] [2] + " |\n |___|___|___|\n");

	    //assignment winning possibilities with corresponding array char
	    row1 = Character.toString (board [0] [0]) + Character.toString (board [0] [1]) + Character.toString (board [0] [2]);
	    row2 = Character.toString (board [1] [0]) + Character.toString (board [1] [1]) + Character.toString (board [1] [2]);
	    row3 = Character.toString (board [2] [0]) + Character.toString (board [2] [1]) + Character.toString (board [2] [2]);
	    col1 = Character.toString (board [0] [0]) + Character.toString (board [1] [0]) + Character.toString (board [2] [0]);
	    col2 = Character.toString (board [0] [1]) + Character.toString (board [1] [1]) + Character.toString (board [2] [1]);
	    col3 = Character.toString (board [0] [2]) + Character.toString (board [1] [2]) + Character.toString (board [2] [2]);
	    diaU = Character.toString (board [0] [0]) + Character.toString (board [1] [1]) + Character.toString (board [2] [2]);
	    diaD = Character.toString (board [0] [2]) + Character.toString (board [1] [1]) + Character.toString (board [2] [0]);
	    
	    //if statement to test for possible win
	    if (diaU.equals ("OOO") || diaD.equals ("OOO") || row1.equals ("OOO")
		    || row2.equals ("OOO") || row3.equals ("OOO") || col1.equals ("OOO")
		    || col2.equals ("OOO") || col3.equals ("OOO"))
	    {
		System.out.println ("\n\tPlayer X wins!!");
		return; //game ends if Player X wins
	    }

	    //**Player X turn**
	    System.out.println ("Player X: Please enter a row:");
	    row = Integer.parseInt (br.readLine ());    //collect selected row

	    System.out.println ("Player X: Please enter a column:");
	    col = Integer.parseInt (br.readLine ());    //collect selected column

	    while (!(row > 0 && row < 4 && col > 0 && col < 4 && board [(row - 1)] [(col - 1)] == 'b'))
	    { //test if row and column selected is valid
		//collect new row and column if invalid
		System.out.println ("\nThe chosen square is invalid!");
		System.out.println ("Player X: Please enter a row:");
		row = Integer.parseInt (br.readLine ());

		System.out.println ("Player X: Please enter a column:");
		col = Integer.parseInt (br.readLine ());
	    }
	    board [(row - 1)] [(col - 1)] = 'X';    //replace selected spot with X
	    
	    //print board
	    System.out.println ("   1   2   3\n  ___ ___ ___ \n1| " + board [0] [0] + " | "
		    + board [0] [1] + " | " + board [0] [2] + " |\n |___|___|___|\n2| "
		    + board [1] [0] + " | " + board [1] [1] + " | " + board [1] [2]
		    + " |\n |___|___|___|\n3| " + board [2] [0] + " | " + board [2] [1]
		    + " | " + board [2] [2] + " |\n |___|___|___|\n");
		    
	    //assignment winning possibilities with corresponding array char
	    row1 = Character.toString (board [0] [0]) + Character.toString (board [0] [1]) + Character.toString (board [0] [2]);
	    row2 = Character.toString (board [1] [0]) + Character.toString (board [1] [1]) + Character.toString (board [1] [2]);
	    row3 = Character.toString (board [2] [0]) + Character.toString (board [2] [1]) + Character.toString (board [2] [2]);
	    col1 = Character.toString (board [0] [0]) + Character.toString (board [1] [0]) + Character.toString (board [2] [0]);
	    col2 = Character.toString (board [0] [1]) + Character.toString (board [1] [1]) + Character.toString (board [2] [1]);
	    col3 = Character.toString (board [0] [2]) + Character.toString (board [1] [2]) + Character.toString (board [2] [2]);
	    diaU = Character.toString (board [0] [0]) + Character.toString (board [1] [1]) + Character.toString (board [2] [2]);
	    diaD = Character.toString (board [0] [2]) + Character.toString (board [1] [1]) + Character.toString (board [2] [0]);

	    //if statement to test for possible win
	    if (diaU.equals ("XXX") || diaD.equals ("XXX") || row1.equals ("XXX")
		    || row2.equals ("XXX") || row3.equals ("XXX") || col1.equals ("XXX")
		    || col2.equals ("XXX") || col3.equals ("XXX"))
	    {
		System.out.println ("\n\tPlayer X wins!!");
		return; //game ends if Player O wins
	    }
	}
	System.out.println ("\tThere is no winner!");   //if end of loop is reached, there was no winner
    }
}

