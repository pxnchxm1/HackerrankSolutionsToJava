import java.io.*;
import java.util.*;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{

    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}

public class JavaMethodOverriding {

    public static void main(String[] args) {
        Sports ss = new Sports();
        Sports s = new Soccer();
        System.out.println(ss.getName());
        ss.getNumberOfTeamMembers();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();
    }
}