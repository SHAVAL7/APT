/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexibleml;

/**
 *
 * @author Elcot
 */

public class Main {
    public static void main(String[] args) 
    {                
        try
        {                    
            MainFrame mf=new MainFrame();
            mf.setTitle("Main Frame");
            mf.setVisible(true);
            mf.setResizable(false);                        
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }        
    }
}
