//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package homeWork12;

import homeWork12.Save;
import homeWork12.SaveToAddress;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SaveToAddress(
        address = "d:/123.txt"
)
public class TextContainer {
    String s = "Bla";

    public TextContainer() {
    }

    @Save
    public void save(String address) throws IOException {
        File file = new File(address);
        FileWriter tmpWrite = new FileWriter(file);
        tmpWrite.append(this.s);
        tmpWrite.flush();
        tmpWrite.close();
    }
}
