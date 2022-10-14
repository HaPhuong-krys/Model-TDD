package tddstart;

public class Dictionary {
    private String name;

   public Dictionary(String name){
        this.name = name;
    }
    public Dictionary(){
    }

    String getName(){
        //return "Example";
        return this.name;
    }

    boolean isEmpty(){
        if(this.name.isEmpty())
            return true;
        return false;
    }
}
