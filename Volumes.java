//Jeffory Heath
//CSIS 1400
//Last Edited 11/01/2016

import java.util.*;
import java.lang.Math;

public class Volumes
{

//Method

		public static double cubiod(double sideA, double sideB, double sideC)
			{
            	
            	return (sideA * sideB * sideC);               
         }      
       
        public static double cubiod(double side)
           {
            return cubiod(side,side,side);
           }       
      
        public static double ellipsoid(double sideA, double sideB, double sideC)
          {
           
           return ((4d/3)*(Math.PI)*(sideA * sideB * sideC));       
          } 
       
       public static double ellipsoid(double side)
          {
            return ellipsoid(side,side,side);       
          }
        
      public static double cylinder(double radius, double height)
         {
            
            return ((Math.PI)*(radius*radius)*(height));       
         } 
       
      public static double cone(double diameter, double side)
         { 
           double radius = diameter / 2;
           double height = Math.sqrt((side * side)-(radius * radius));
           return ((1d/3)*(Math.PI)*(radius*radius)*(height));       
         }
      
}