/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gamer
 */
public class Archive {
    private String name;
    private String identif;
    
    public Archive(String identif, String name){
        this.name = name;
        this.identif = identif;
    }
    public String getIdentif()
    {
        return this.identif;
    }
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compare){
        if(this == compare){
            return true;
        } 
        if(!(compare instanceof Archive)){
            return false;
        }
        
        Archive compArchive = (Archive) compare;
        
        return this.identif.equals(compArchive.identif);

    }
}
