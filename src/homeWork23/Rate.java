package homeWork23;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by User on 29.05.2016.
 */
@XmlRootElement(name = "rate")
public class Rate {
    @XmlElement
    public String name;
    @XmlElement
    public double rate;
    @XmlElement
    public String date;
    @XmlElement
    public String time;
    @XmlElement
    public double ask;
    @XmlElement
    public double bid;

    @Override
    public String toString() {
        return "Rate{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", ask=" + ask +
                ", bid=" + bid +
                '}';
    }
}
