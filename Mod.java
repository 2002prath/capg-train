import java.lang.*; 
import java.io.*; 
 

class Mod
{ 
  public static void main(String[] amg)
   { 
     int a = 9898989; 
     int sum=0; 
     while(a%10<10) 
     { 
        sum= sum + a%10; 
        System.out.println(sum); 
     }   
   } 
} 