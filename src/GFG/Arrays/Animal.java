package GFG.Arrays;

public class Animal {

    public static Animal single_instance = null;

    private Animal(){

    }

    public static Animal getInstance(){
        if(single_instance ==null){
            single_instance = new Animal();
        }

        return single_instance;
    }
}
