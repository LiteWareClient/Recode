package OOPHELP;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        ArrayList<User> mods = new ArrayList<User>();
        mods.add(new User("Caleb"));
        mods.add(new User("You"));
        mods.add(new User("Jade"));

        for(User u : mods){
            System.out.println(u.get_name());
        }
    }
}
