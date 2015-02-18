import javax.swing.JOptionPane;
public class Adder
{
	public static void main( String args[] )
	{  String firstNumber,secondNumber;
	   int number1,number2,result;
	   firstNumber = JOptionPane.showInputDialog(  "Enter first integer:");
	   secondNumber = JOptionPane.showInputDialog( "Enter second integer:" );
	   
	   		number1 = Integer.parseInt( firstNumber );
	   		number2 = Integer.parseInt( secondNumber );
	   		result = number1+number2;
	   		
	   		JOptionPane.showMessageDialog(null, result, "Add Results",JOptionPane.INFORMATION_MESSAGE );
	}
}