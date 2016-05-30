package homeWork23;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by User on 29.05.2016.
 */
@XmlRootElement()
public class Rate {
    @XmlAttribute
    public String id;
    @XmlElement(name = "Name")
    public String name;
    @XmlElement(name = "Rate")
    public double rate;
    @XmlElement(name = "Date")
    public String date;
    @XmlElement(name = "Time")
    public String time;
    @XmlElement(name = "Ask")
    public double ask;
    @XmlElement(name = "Bid")
    public double bid;

    @Override
    public String toString() {
        return "Rate{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", ask=" + ask +
                ", bid=" + bid +
                '}';
    }
}
