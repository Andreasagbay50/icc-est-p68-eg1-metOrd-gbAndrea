package controllers;

import models.Movie;

public class MovieController {
    public void sortByTitle(Movie[] movies){
        int n = movies.length;
        for(int i = 0 ; i < n -1 ; i++){
            int numme = i;
            for(int j= i+1; j < n ; j++){
                if(movies[j].getName().compareToIgnoreCase(movies[numme].getName())>0){
                    numme = j;
                }
            }
            Movie c = movies[i];
            movies[i]= movies[numme];
            movies[numme] = c ;

        }
        
    }
    public void mostrar(Movie[] movies){
        for(Movie y : movies){
            System.out.println("nombre " + y.getName() + " año  " + y.getYear());
        }
    }


    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden descendente.
     * 
     * Metodo: sortByTitle
     * 
     * @param movies Arreglo de películas a ordenar
     */

}
