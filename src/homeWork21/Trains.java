package homeWork21;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

/**
 * Created by User on 30.05.2016.
 */
@XmlRootElement
public class Trains {
    @XmlElement
    public ArrayList<Train> train;

    @Override
    public String toString() {
        return "Trains{" +
                "train=" + train +
                '}';
    }


}
