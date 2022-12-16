package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
String stage = JOptionPane.showInputDialog(null,"how old are you");

int age= Integer.parseInt(stage);

if(age>=18)
{
	JOptionPane.showInputDialog(null,"Who do you think the next president should be");
}
else
{
	JOptionPane.showMessageDialog(null, "Your thoughts do not matter");
}
	
	
	
	
}
}