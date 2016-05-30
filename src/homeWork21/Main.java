package homeWork21;

import homeWork23.Query;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.lang.reflect.Field;

/**
 * Created by User on 30.05.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\MyProject\\progpro\\src\\homeWork21\\Train.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Trains trains = (Trains) unmarshaller.unmarshal(file);
            System.out.println(trains);
            String start="15:00";
            System.out.println((trains.train.get(1).departure));
        }catch (JAXBException e){
            System.out.println(e);
        }

    }
}
