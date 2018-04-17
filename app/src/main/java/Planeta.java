/**
 * Created by UCA on 16/04/2018.
 */

public class Planeta {

    private int id;
    private String name;
    private String description;

    public Planeta(){

    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setId(int id){
        this.id  = id;
    }


}
