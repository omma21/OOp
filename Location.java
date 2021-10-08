/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syedt
 */
public class Location {
        private String name;
        private double latitude;
        private double longitude;
public Location( String name,double latitude,double longitude)
{
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude;
}
public boolean equals(Object o){
if (o instanceof Location) {
    Location other = (Location)o;
    return this.name.equals(other.name) && 
       this.latitude == other.latitude && 
       this.longitude == other.longitude;
}
else {
    return false;
}
}       
       
        @Override
public String toString(){
 
String str = "" + this.name + "(" + this.latitude + ", " + this.longitude + ")";

return str;
}
public int hashCode() {
  return this.name.hashCode() ^ 
         new Double(this.longitude).hashCode() ^ 
         new Double(this.latitude).hashCode();
}



}
