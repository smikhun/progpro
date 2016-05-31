package homeWork21;

import homeWork23.Query;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by User on 30.05.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception, JAXBException{

        File file = new File("C:\\MyProject\\progpro\\src\\homeWork21\\Train.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Trains trains = (Trains) unmarshaller.unmarshal(file);

        trains.train.add(new Train("3","Kyiv", "Kharkiv","31.05.2016", "18:00"));

        LocalDateTime start = LocalDateTime.of( LocalDate.now(), LocalTime.of(15 , 0));
        LocalDateTime end = LocalDateTime.of( LocalDate.now(), LocalTime.of(20 , 0));

        searchTrains(trains, start, end);
        saveToXml(trains,file);
    }

    static void saveToXml(Trains trains, File file) throws JAXBException{

        JAXBContext jaxbContext1 = JAXBContext.newInstance(Trains.class);
        Marshaller marshaller = jaxbContext1.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(trains, file);
    }

    static void searchTrains(Trains trains, LocalDateTime start, LocalDateTime end){
        for (Train t: trains.train) {

            String dateTime = (t.date) + " " + (t.departure);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
            LocalDateTime trainDate = LocalDateTime.parse(dateTime, formatter);

            if ((trainDate.isAfter(start)) && (trainDate.isBefore(end))) {
                System.out.println(t);
            }
        }
    }
}
