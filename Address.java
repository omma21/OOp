/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syedt
 */
public class Address {
    
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String addressLine4;
        private String postcode;
  public Address (String addressLine1, String addressLine2,String addressLine3,
          String addressLine4, String postcode)   {
  this.addressLine1 = addressLine1;
  this.addressLine2 = addressLine2;
  this.addressLine3 = addressLine3;
  this.addressLine4 = addressLine4;
  this.postcode = postcode;
  
  }  
  public Address (String addressLine1, String addressLine2,String addressLine3,
          String postcode){
      this.addressLine1 = addressLine1;
      this.addressLine2 = addressLine2;
      this.addressLine3 = addressLine3;
      this.addressLine4 = "" ;
      this.postcode = postcode;
  }
  public Address (String addressLine1, String addressLine2,String postcode){
      this.addressLine1 = addressLine1;
      this.addressLine2 = addressLine2;
      this.addressLine3 = "";
      this.addressLine4 = "";
      this.postcode = postcode;
  } 

  public  String getLine1(){
      return addressLine1;
  }
  public String getLine2(){
      return addressLine2;
}
  public String getLine3(){
      return addressLine3;
  }
  public String getLine4(){
      return addressLine4;
  }
  public String getLine5(){
      return postcode;
      
}
  public String toString(){
      String str= "";
      str=str+addressLine1 + "\n" + addressLine2 + "\n";
      
     if (addressLine3 != ""){
      str = str+addressLine3 + "\n";
     } 
      if (addressLine4 != ""){
      str = str+addressLine4 + "\n";
     } 
     str = str+postcode+ "\n";
     return str;
 }
public boolean equals(Object o){
if (o instanceof Address) {
    Address other = (Address)o;
    return this.addressLine1.equals(other.addressLine1) && 
       this.addressLine2.equals(other.addressLine2) && 
       this.addressLine3.equals(other.addressLine3) && 
       this.addressLine4.equals(other.addressLine4) && 
       this.postcode.equals(other.postcode);

}
    
   else {
    return false;
  }    
}
}