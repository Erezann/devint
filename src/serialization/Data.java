package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Serialize and deserialize an object in a document .data
 * 
 * @author Amir BEN SLIMANE
 */
abstract public class Data {
	static final long serialVersionUID = 20223210300L;

	public static boolean store(Object data, String name) {
		FileOutputStream file = null;
		ObjectOutputStream out = null;

		if (data == null) {
			return false;
		}

		name = "data/" + name + ".data";

		try {
			file = new FileOutputStream(name);
			out = new ObjectOutputStream(file);
			out.writeObject(data);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@SuppressWarnings("resource")
	public static Object load(String name) {
		FileInputStream file = null;
		ObjectInputStream in = null;
		Object res = null;

		name = "data/" + name + ".data";

		try {
			file = new FileInputStream(name);
		} catch (Exception e1) {

			name = "data/" + name;
			try {
				file = new FileInputStream(name);
			} catch (Exception e2) {
				return null;
			}
		}

		try {
			in = new ObjectInputStream(file);
		} catch (Exception e) {
			return null;
		}

		try {
			res = in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return res;
	}
}
