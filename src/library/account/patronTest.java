/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.account;

/**
 *
 * @author ookik
 */
public class patronTest {
    
    public static void main(String[] args) {
        PatronAccount p1 = new PatronAccount("jeff", "godoy","5555555555","jeff@domain.com","123 Sesame St.");
        AccountCollection.insertPatron(p1);
        
        
    }
}
