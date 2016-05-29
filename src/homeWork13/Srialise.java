//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package homeWork13;

import homeWork13.Save;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import utils.AnnotationUtils;

public class Srialise {
    public Srialise() {
    }

    public static String out(Object ob) throws Exception {
        Class cl = ob.getClass();
        ArrayList annFiled = AnnotationUtils.getFildsByAnnotation(ob, Save.class);
        File file = new File("d:/serv.txt");
        FileWriter tmp = new FileWriter(file);
        Iterator var5 = annFiled.iterator();

        while(var5.hasNext()) {
            Field x = (Field)var5.next();
            tmp.append(x.getName() + "\n");
            if(x.getType() == String.class) {
                tmp.append((String)x.get(ob) + "\n");
            } else if(x.getType() == Integer.TYPE) {
                tmp.append(Integer.toString(x.getInt(ob)) + "\n");
            }
        }

        tmp.flush();
        tmp.close();
        return file.getPath();
    }

    public static Object in(Class cl, String address) throws IOException, Exception {
        FileReader tmp = new FileReader(address);
        BufferedReader buffer = new BufferedReader(tmp);
        Object newObj = cl.newInstance();
        HashMap fieldsMap = new HashMap();
        String s = null;

        while((s = buffer.readLine()) != null) {
            fieldsMap.put(s, buffer.readLine());
        }

        ArrayList fields = AnnotationUtils.getFildsByAnnotation(newObj, Save.class);
        Iterator var8 = fields.iterator();

        while(var8.hasNext()) {
            Field f = (Field)var8.next();
            if(f.getType() == String.class) {
                f.set(newObj, fieldsMap.get(f.getName()));
            } else if(f.getType() == Integer.TYPE) {
                f.setInt(newObj, Integer.parseInt((String)fieldsMap.get(f.getName())));
            }
        }

        return newObj;
    }
}
