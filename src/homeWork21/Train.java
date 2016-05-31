package homeWork21;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by User on 30.05.2016.
 */
@XmlRootElement(name = "train")
public class Train {
    @XmlAttribute
    public String id;
    @XmlElement
    public String from;
    @XmlElement
    public String to;
    @XmlElement
    public String date;
    @XmlElement
    public String departure;

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                ", departure='" + departure + '\'' +
                '}';
    }

    public Train(String id, String from, String to, String date, String departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }

    public Train() {
    }
}
