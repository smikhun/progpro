//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package homeWork13;

import homeWork13.Save;
import java.io.Serializable;

public class TestClas implements Serializable {
    @Save
    public String a;
    public int b;
    @Save
    public int c;

    public TestClas(String a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TestClas() {
    }

    public String getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public String toString() {
        return "TestClas{a=\'" + this.a + '\'' + ", b=" + this.b + ", c=" + this.c + '}';
    }
}
