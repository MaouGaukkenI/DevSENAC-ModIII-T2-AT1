
import javax.swing.JOptionPane;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TheDe
 */
public class teste {
    @Test
    public void Teste(){
        String email = "Gaukken@gmail.com";
        
        if(email != null){
            // Remove todos os caracteres, exceto '@'
            String emailAdapt = email.replaceAll("[^@]", "");
            
            if(emailAdapt.length() == 1){
                System.out.println("Possui @");
            } else if("".equals(email)){
                System.out.println("Email vazio");
            } else {
                JOptionPane.showMessageDialog(null, "Email está incorreto!");
            }
            
        } else {
            System.out.println("Email nulo!");
        }
    }
}
