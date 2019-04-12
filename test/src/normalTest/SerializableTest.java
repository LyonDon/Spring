package normalTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String args[]) throws Exception {

		File file = new File("box.out");

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fos);
		Box oldBox = new Box(10, 20);
		out.writeObject(oldBox);
		out.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fis);
		Box newBox = (Box) in.readObject();
		in.close();
		System.out.println(newBox.toString());

	}
}