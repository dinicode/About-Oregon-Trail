package org.yup.oregontrail;

import javax.xml.namespace.QName;

public class OregonTrailApp {

   public static void main(String[] args){

       Traveler Ramonie = new Traveler("Ramonie", 100, 100);

       System.out.println("before hunting food:" + Ramonie.getFood());
       System.out.println(Ramonie.hunt());
       System.out.println(Ramonie.getFood());
       System.out.println(Ramonie.hunt());
   }

}


