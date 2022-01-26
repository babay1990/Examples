import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public List<User> collect(List<User> list, String name){
        return list.stream().filter((s) -> s.getName().equals(name)).collect(Collectors.toList());
    }

    public List<User> changeAge(List<User> list, int age){
        list.stream().forEach((s) -> s.setAge(s.getAge() + age));
        return list;
    }

    public boolean isTrue(List<User> list, String name){
       return list.stream().anyMatch((s) -> s.getName().equals(name));
    }

}
