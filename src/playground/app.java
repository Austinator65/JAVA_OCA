package playground;

import java.util.ArrayList;
import java.util.List;

public class app

{

    public static void main(String[] args)

    {

        List<String> names = new ArrayList<String>();

        String[] friends = { "Sam", "Jessica", "Mark", "Alexis" };

        for (int i = 0; i < friends.length; i++) {
            names.add(friends[i]);
        }

        System.out.println(names);

    }

}