package streams.Services;

import org.springframework.stereotype.Service;
import streams.Models.User;
import streams.UsersStream;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



@Service
public class StreamService {

    static Stream<User> users = UsersStream.getStream();

   public StreamService() {

        users = Stream.of(User.createUser(), User.createUser(), User.createUser());

   }

    public List<User> getStream() {
       return users.collect(Collectors.toList());
    }


    public void printStream() {

       users.forEach(s -> System.out.println(s));
    }

    public User getByAge() {

       return (User) users.filter(user -> user.getAge() < 18)
               .peek(user -> user.setAge(user.getAge() * 2))
               .skip(users.count() - 1);
    }

    public Optional<User> getYoungestUser() {

       return  users.reduce((first, second) -> first.getAge() < second.getAge() ? first: second);
    }

    public Optional<User> getOldestUser() {

        return  users.reduce((first, second) -> first.getAge() > second.getAge() ? first: second);
    }

    public List<User> getByRemovingDuplicates() {

       return users.distinct()
               .collect(Collectors.toList());
    }


    public List<User> getBySorting() {
       //Filter users with age > 30, transform their names to uppercase and sort them descending by age

        return users.filter(user -> user.getAge() > 30)
                .peek(user -> user.setName(user.getName().toUpperCase(Locale.ROOT)))
                .sorted((first, second) -> Integer.compare(second.getAge(), first.getAge()))
                .collect(Collectors.toList());

    }


}
