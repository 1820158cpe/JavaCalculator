/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacalculatorjoption;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerou Jeuell U. Espelita     CPE3A
 */
public class JavaCalculatorJOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String option;
        while(true){
            option = JOptionPane.showInputDialog("SIMPLE CALCULATOR \n Do you wish to proceed? \n Y for yes and N for No");
        
            switch(option){
                case "Y":
                    String num1 = JOptionPane.showInputDialog("Enter the first number : ");
                    String operation = JOptionPane.showInputDialog("Operations:\n + for addition\n - for subtraction\n * for multiplication\n / for division"
                            + "Enter the operation:");
                    String num2 = JOptionPane.showInputDialog("Enter the second number : ");
                
                    switch(operation){
                        case "+":
                            JOptionPane.showMessageDialog(null,Integer.parseInt(num1) + Integer.parseInt(num2));
                            break;
                        case "-":
                            JOptionPane.showMessageDialog(null, Integer.parseInt(num1) - Integer.parseInt(num2));
                            break;
                        case "*":
                            JOptionPane.showMessageDialog(null,Integer.parseInt(num1) * Integer.parseInt(num2));
                            break;
                        case "/":
                            JOptionPane.showMessageDialog(null, Integer.parseInt(num1) / Integer.parseInt(num2));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Please enter a valid operator\n Operations: + for addition\n - for subtraction\n * for multiplication\n / for division");
                    }break;
                case "N":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"You entered an invalid key!");
                    break;
            }      
        }
        
    }
    
}
