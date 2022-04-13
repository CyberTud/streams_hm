package streams.Models;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@Data
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    private int age;

    static private int new_id = 1;
    static String names[] = {"Tudor", "Ales", "Marcus", "Gigel"};


    public static User createUser() {

        return new User(new_id++, names[new Random().nextInt(names.length)], new Random().nextInt(100));
    }
}
