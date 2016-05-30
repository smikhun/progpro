package homeWork23;

import utils.GetContent;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.net.URL;

/**
 * Created by User on 28.05.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        String yahoo = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22USDEUR%22,%20%22USDUAH%22)&env=store://datatables.org/alltableswithkeys";

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            String result = GetContent.getContent(yahoo);
            File g = new File("txmt.dsf");
            Query query = (Query) unmarshaller.unmarshal(g);

            System.out.println(query);

        }catch (JAXBException e){
            System.out.println(e);
        }


    }
}
