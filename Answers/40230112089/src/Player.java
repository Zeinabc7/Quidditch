import java.util.*;
public class Player implements Success {
    public String name;
    public int number;

    Player(String name, int number){
        this.name = name;
        this.number = number;
    }

   @Override
    public boolean isSuccessful() {
       return false;
    }
   }

