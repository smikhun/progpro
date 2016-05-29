//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package homeWork12;

import homeWork12.Save;
import homeWork12.SaveToAddress;
import homeWork12.TextContainer;
import java.lang.reflect.Method;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        TextContainer text = new TextContainer();
        Class c = TextContainer.class;
        if(c.isAnnotationPresent(SaveToAddress.class)) {
            Method[] metods = c.getMethods();
            Method[] var4 = metods;
            int var5 = metods.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                Method m = var4[var6];
                if(m.isAnnotationPresent(Save.class)) {
                    SaveToAddress abot = (SaveToAddress)c.getAnnotation(SaveToAddress.class);
                    m.invoke(text, new Object[]{abot.address()});
                }
            }
        } else {
            System.out.println("Sorry your class is not annotated");
        }

    }
}
