package homeWork23;

import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Created by User on 28.05.2016.
 */
@XmlRootElement(name = "query")
public class Query {
    @XmlElement
    public Results results;

    @Override
    public String toString() {
        return "Query{ results=" + results +
                '}';
    }
}
