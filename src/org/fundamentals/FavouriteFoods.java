package org.fundamentals;



public class FavouriteFoods {
    public static void main(String[] args) {

        String[] Foods = {"Pizza", "Hamburger", "Sushi", "Pasta", "Cornetto"};
        int lunghezzaClassifica = Foods.length;
        System.out.println("La lunghezza della classifica è " + lunghezzaClassifica);
        System.out.println("Il mio cibo preferito è " + Foods[0]);
        System.out.println("Il mio cibo preferito ma non troppo è " + Foods[Foods.length-1]);
        System.out.println("il cibo in mezzo alla classifica è " + Foods[Foods.length/2]);
    }
}
