import java.lang.*;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays; 

public class Movies{
 
 
  public static void main(String[] args){ 
    
    String[] IndianaFilms = {
    "Indiana Jones and the Temple of Doom",
    "Indiana Jones and the Last Crusade",
    "Indiana Jones and the Kingdom of the Crystal Skull"
    };
    
    String[] Indiana_Jones_and_the_Temple_of_Doom = {
    "Harrisson Ford",
    "Kate Capshaw",
    "Amrish Puri"
    };
    
    String[] Indiana_Jones_and_the_Last_Crusade = {
    "Harrisson Ford",
    "Denholm Elliott",
    "Alison Doody"
    };
    
    String[] Indiana_Jones_and_the_Kingdom_of_the_Crystal_Skull = {
    "Harrisson Ford",
    "Cate Blanchett",
    "Karen Allen"
    } ;

    String[][] ActeursIndianaFilms = new String[][]{
      Indiana_Jones_and_the_Temple_of_Doom,
      Indiana_Jones_and_the_Last_Crusade,
      Indiana_Jones_and_the_Kingdom_of_the_Crystal_Skull
    };
       
    int i=0;
    for(String film : IndianaFilms){
      String sfilm = film.replace(" ", "_");
      String sacteurs = Arrays.toString(ActeursIndianaFilms[i]);
      sacteurs = sacteurs.replace("[","");
      sacteurs = sacteurs.replace("]","");
      System.out.println("Dans le film "+ film + " les acteurs principaux sont " + sacteurs);
      
      i++; 
    }
    
    
  }//Fin de la méthode main

}//Fin de votre classe
