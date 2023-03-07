/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1874.framework;

/**
 *
 * @author ITU
 */
public class Utilitaire {
    public static String infoUrl(String url, String nomDomaine) throws Exception {
        int index = url.indexOf(nomDomaine);
        if (index == -1) {
            // La sous-chaîne n'a pas été trouvée dans la chaîne originale
            throw new Exception("nom de domaine non valide");
        } else {
            // Supprime la sous-chaîne de la chaîne originale et renvoie la nouvelle chaîne
             url=url.substring(0, index) + url.substring(index + nomDomaine.length());
        }
        
        index = url.indexOf("?");
        if (index == -1) {
            // La sous-chaîne n'a pas été trouvée dans la chaîne originale
            return url;
        } else {
            // Supprime la sous-chaîne de la chaîne originale et renvoie la nouvelle chaîne
            return url.substring(0, index);
        }
    }
    
    public static String infoUrl2(String url) throws Exception {
          return url.substring(1,url.length());
    }
    
    public static void main(String[] args) throws Exception
    {
        System.out.println(infoUrl("http://localhost:8080/Framework/pizza/porno?cullote", "http://localhost:8080/Framework/"));
    }
}
