package homeWork23;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by User on 28.05.2016.
 */
@XmlRootElement(name = "query")
public class Query {
    public Result result;
    @XmlElement
    public Result getResult() {
        return result;
    }
}
