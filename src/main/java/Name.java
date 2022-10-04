import com.google.gson.GsonBuilder;

public class Name {
    public static void main(String[] args) {

        Person person = new Person("Oleksandr", "Fomin");
        Object gson = new GsonBuilder().create().toJson(person);

        System.out.println(gson);
    }
}

