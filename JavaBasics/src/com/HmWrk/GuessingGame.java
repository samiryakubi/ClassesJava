package com.HmWrk;

import javax.swing.JOptionPane;

public class GuessingGame {
	public static void main(String[] args) {
        // TODO Auto-generated method stub

        String computerPick;
        String userPick;
        
        int roundsToPlay = 0;
        int totalWin = 0;
        
        while(roundsToPlay < 10) {
            
            computerPick = computerPick();
            userPick = userPick();
            
            roundsToPlay++;
            
            if(computerPick.equalsIgnoreCase(userPick)) {
                JOptionPane.showMessageDialog(null, "Computer picked: "+computerPick+"\nYou picked: "+userPick+" Right guess!");
                totalWin++;
            } else {
                JOptionPane.showMessageDialog(null, "Computer picked: "+computerPick+"\nYou picked: "+userPick+" Wrong guess!");
            }    
        }
        JOptionPane.showMessageDialog(null, "Total right guesses: "+totalWin);
    }
    
    public static String computerPick() {
        
        
        String color = "";
        int number = 0;
        
        String input = JOptionPane.showInputDialog("Pick from the menu: \n0: Red\n1: Green\n2: Blue\n3: Orange\n4: Yellow");
        number = Integer.parseInt(input);
        
        switch(number) {
        case 0:
            color = "Red";
            break;
        case 1:
            color = "Green";
            break;
        case 2:
            color = "Blue";
            break;
        case 3:
            color = "Orange";
            break;
        case 4:
            color = "Yellow";
            break;        
        }
        
        return color;    
    }
    
    public static String userPick() {
        
        String color = "";
        int number = 0;
        
       GuessingGame rand = new GuessingGame ();
        
        number = rand.nextInt(5);
        
        switch(number) {
        case 0:
            color = "Red";
            break;
        case 1:
            color = "Green";
            break;
        case 2:
            color = "Blue";
            break;
        case 3:
            color = "Orange";
            break;
        case 4:
            color = "Yellow";
            break;        
        }
        
        return color;
    }

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}

