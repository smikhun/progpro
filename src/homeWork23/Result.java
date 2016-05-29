package homeWork23;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by User on 28.05.2016.
 */
@XmlRootElement
public class Result {
    public Rate rate;

    @XmlElement
    public Rate getRate() {
        return rate;
    }
}
