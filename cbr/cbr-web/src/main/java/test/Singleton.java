package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingleDmo implements Cloneable, Serializable {
    int i;
    int j;
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	final static SingleDmo demo = new SingleDmo();
	private SingleDmo() {
	}

	public static Object getInstance() {
		return demo;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println();
		throw new CloneNotSupportedException();

	}

	/*protected Object readResolve() {
		return getInstance();
	}*/
}
public class Singleton {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SingleDmo demo=(SingleDmo) SingleDmo.getInstance();
		demo.setI(10);
		demo.setJ(20);
        ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("filename.txt"));
        ob.writeObject(demo);
        demo.setJ(30);
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("filename.txt"));
        SingleDmo dem=(SingleDmo) in.readObject();
        System.out.println(demo);
        System.out.println(dem);
	}
	}

