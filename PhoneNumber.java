/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syedt
 */
public class PhoneNumber {
    private String name;
    private String number;
    
public PhoneNumber (String name, String number){
        this.name = name;
        this.number = number;}
public String getName(){
    return name;
}
public String getNumber(){
    return number;
}
public String toString(){
    String str="";
   str = str + name + " " + number;

    
    return str;
}
public boolean equals(Object o){
if (o instanceof PhoneNumber) {
    PhoneNumber other = (PhoneNumber)o;
    return this.name.equals(other.name) && 
       this.number.equals(other.number); 
    
      
  }
    
   else {
    return false;
  }    
}
}
