package homeWork23;

import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Created by User on 28.05.2016.
 */
@XmlRootElement(name = "query")
@XmlAccessorType(XmlAccessType.NONE)
public class Query {
    @XmlAttribute
    public int count;
    @XmlAttribute
    public Date create;
    @XmlAttribute
    public String lang;

    @XmlElement
    public Result result;

    @Override
    public String toString() {
        return "Query{" +
                "count=" + count +
                ", create=" + create +
                ", lang='" + lang + '\'' +
                ", result=" + result +
                '}';
    }
}
