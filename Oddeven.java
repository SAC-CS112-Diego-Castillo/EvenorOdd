



// MAIN



import javax.swing.JOptionPane;

public class Oddeven 

{

	public static void main(String[] args)

	{

		int low = randomnumber3.getRangeLow();

		int high = randomnumber3.getRangeHigh();



		int theNumber = randomnumber3.getNumber(low, high);		

		boolean guessedRight = false;



		while (guessedRight == false)

		{

			int guess = Integer.parseInt(JOptionPane.showInputDialog(String.format("Guess a number between %d and %d: ", low, high)));



			if (guess == theNumber)

			{

				guessedRight = true;

				JOptionPane.showMessageDialog(null, "That's right!");

			}



			else if (guess > theNumber)

				JOptionPane.showMessageDialog(null, "Too High");



			else 

				JOptionPane.showMessageDialog(null,  "Too Low");

		}

	}

}