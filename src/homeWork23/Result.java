package homeWork23;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by User on 26.05.2016.
 */
@XmlRootElement(name = "result")
public class Result {
    @XmlElement
    public Rate rate;

    @Override
    public String toString() {
        return "Result{" +
                "rate=" + rate +
                '}';
    }
}
