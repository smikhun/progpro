//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package homeWork22;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import homeWork22.JSONG;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("C:\\MyProject\\progpro\\src\\homeWork22\\json.txt", "r");

        byte[] buffer;
        try {
            buffer = new byte[(int)file.length()];
            file.read(buffer);
        } finally {
            file.close();
        }

        String buf = new String(buffer);
        Gson gson = (new GsonBuilder()).create();
        JSONG json = (JSONG)gson.fromJson(buf, JSONG.class);
        System.out.println(json);
    }
}
