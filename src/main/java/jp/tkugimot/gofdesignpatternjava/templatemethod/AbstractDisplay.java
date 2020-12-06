package jp.tkugimot.gofdesignpatternjava.templatemethod;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    /**
     * Template Method
     * abstract methodを使用している。
     */
    public final void display() {
        open();
        print();
        close();
    }
}
