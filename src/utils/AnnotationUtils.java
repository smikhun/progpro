package utils;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by User on 28.05.2016.
 */
public class AnnotationUtils {
    public static ArrayList<Field> getFildsByAnnotation(Object ob, Class annotation)throws Exception{
        Class cl = ob.getClass();
        Field[] fields = cl.getDeclaredFields();
        ArrayList<Field> getFilds = new ArrayList<Field>();

        for (Field f : fields){
            if (f.isAnnotationPresent(annotation)){
                getFilds.add(f);
            }
        }
        return getFilds;
    }
}
