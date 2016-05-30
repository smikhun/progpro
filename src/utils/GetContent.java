package utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by User on 30.05.2016.
 */
public class GetContent {
    public static String getString(String http)throws Exception{
        URL tmp = new URL(http);
        URLConnection urlc=tmp.openConnection();
        System.out.println(urlc.getContent());
        InputStream in = urlc.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        byte[] buffer = new byte[2048];
        int length;

        while ((length = in.read(buffer)) != -1) {
            out .write(buffer, 0, length);
        }
        return new String(out.toByteArray());
    }

    public static File toFile(String http)throws Exception{
        URL tmp = new URL(http);
        URLConnection urlc=tmp.openConnection();
        System.out.println(urlc.getContent());
        InputStream in = urlc.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        byte[] buffer = new byte[10000];
        int length;

        while ((length = in.read(buffer)) != -1) {
            out .write(buffer, 0, length);
        }

        File file = new File("tmp.xml");
        FileWriter wfile = new FileWriter(file);
        wfile.write(new String(out.toByteArray()));
        wfile.flush();
        wfile.close();
        return file;
    }
}
