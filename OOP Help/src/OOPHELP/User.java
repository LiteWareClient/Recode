package OOPHELP;

import java.util.Objects;

public class User {
    private String _name;
    private String _membership = "BRONSE";

    public User(String name) {
        set_name(name);
    }

    public String toString(){
        return get_name() + " " + get_membership();
    }

    public boolean equals(User u2){
        if(get_name() == u2.get_name() && get_membership() == u2.get_membership()){
            return true;
        }else{
            return false;
        }
    }
    public User(){

    }

    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    public void set_name(String name){
        _name = name;
    }

    public String get_name(){
        return _name;
    }

    public void set_membership(String membership){
        _membership = membership;
    }

    public void set_membership(Membership membership){
        _membership = membership.name();
    }

    public String get_membership(){
        return _membership;
    }

    public enum Membership{
        FREE,
        BRONSE,
        SILVER,
        GOLD;
    }

}
