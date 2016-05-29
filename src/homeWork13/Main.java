//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package homeWork13;

import homeWork13.Srialise;
import homeWork13.TestClas;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        TestClas tc = new TestClas("Masha", 25, 27);
        System.out.println(tc);
        String address = Srialise.out(tc);
        TestClas des = (TestClas)Srialise.in(tc.getClass(), address);
        System.out.println(des);
    }
}
