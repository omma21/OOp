/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syedt
 */
//import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Contact {
   private String firstName;
   private String lastName;
   private Address address;
   private  List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
   //this.phoneNumbers = new ArrayList<PhoneNumber>();
   
 public Contact (String firstName, String lastName){
     this.firstName = firstName;
     this.lastName = lastName;
     //this.address = address;
 }
 public void setAddress(Address address){
       this.address = address;
 }
      
     
   
   @Override
 public String toString(){
     String str = "";
       
     str =str+firstName + " " + lastName + "\n"+address.toString();
     //System.out.println(address.toString);
     for(int i=0; i<phoneNumbers.size(); i++ ){
         str= str+phoneNumbers.get(i).toString()+"\n";
     }
     return str;
 }
    public void addPhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumbers.add(phoneNumber);
    }
    public boolean equals(Object o){
if (o instanceof Contact) {
    Contact other = (Contact)o;
    return this.firstName.equals(other.firstName) && 
       this.lastName.equals(other.lastName) && 
       this.address.equals(other.address) && 
       this.phoneNumbers.equals(other.phoneNumbers); 
       

}
    
   else {
    return false;
  }    
}
}
