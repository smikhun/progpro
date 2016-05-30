package homeWork23;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by User on 26.05.2016.
 */
@XmlRootElement(name = "results")
public class Results {
    @XmlElement
    public ArrayList<Rate> rate;

    @Override
    public String toString() {
        return "Results{" +
                "rate=" + rate +
                '}';
    }
}
