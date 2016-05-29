package homeWork22;

import java.util.Arrays;

/**
 * Created by User on 24.05.2016.
 */
public class JSONG {
    public String name;
    public String surname;
    public String[] phones;
    public String[] sites;
    public Address address;

    @Override
    public String toString() {
        return "JSON{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", sites=" + Arrays.toString(sites) +
                ", address=" + address +
                '}';
    }
}
