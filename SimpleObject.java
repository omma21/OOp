
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syedt
 */
public class SimpleObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Address a1= new Address ( "103 Borough Road", "London", "SE1 0AA");
   //Address a4=a1;
   //System.out.println( a1);
   Address a4 = new Address( "103 Borough Road", "London", "SE1 0AA");
  // if (a1.equals(a4)) {
  //System.out.println( "Addresses are equal.");
//} else {
 // System.out.println( "Addresses are not equal.");
//}

    
   PhoneNumber p1 = new PhoneNumber ( "work:", "02078157483");
   //System.out.println (p1);
   PhoneNumber p2 = new PhoneNumber ("Home:" , "0234568");
   //PhoneNumber P2 = p1;
 //  if (p1.equals(p2)) {
 //       System.out.println( "PhoneNumbers are equal.");
//} else {
//  System.out.println( "PhoneNumbers are not equal.");
//}
  // }
   
   Contact c1 = new Contact ("Omma" , "Habiba");
   Contact c2 = new Contact ("Omma" , "Habiba");
   c1.setAddress(a1);
   c1.addPhoneNumber(p1);
   c1.addPhoneNumber(p2);
   c2.setAddress(a1);
   c2.addPhoneNumber(p1);
   c2.addPhoneNumber(p2);
   
   if (c1.equals(c2)){
       System.out.println("Contacts are equal");
       }
   else{
    System.out.println("Contacts are not equal");
}
   //c1.setAddress(a1);
   //c1.addPhoneNumber(p1);
   //c1.addPhoneNumber(p2);
    //System.out.println (c1);
     Location l1 = new Location ("London", 51.528308, -0.3817765);
     Location l2 = new Location ("paris", 48.8587741, 2.2069771);
     Location l3 = new Location ("paris", 48.8587741, 2.2069771);
     Location l4 = l1;
     Location l5 = l2;
     Location l6 = l5;
      
     //System.out.println(l1==l2);
//     System.out.println(l1==l4);
//     System.out.println(l2==l6);
//     System.out.println(l2==l3);
Set<Location> set = new HashSet<>();
set.add(l1);
set.add(l2);
set.add(l3);
for(Location loc : set) {
  System.out.println(loc);
}
System.out.println();

    }
}   
    

