import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
/**
 * Class for ToDo list logic.
 * 
 * @author Willis
 * @version 4.23.2021
 */
public class ToDo {

	private String item;
	private static ArrayList<ToDo> list;
	
	/**
	 * Default constructor.
	 */
	ToDo() {
		item = "";
	}
	
	/**
	 * Overloaded parameterized constructor.
	 * 
	 * @param item info.
	 */
	ToDo(String item) {
		this.item = item;
	}
	
	/**
	 * Item getter.
	 * 
	 * @return item info.
	 */
	private String getItem() {
		return this.item;
	}
	
	/**
	 * Item setter.
	 * 
	 * @param item new item value.
	 */
	void setItem(String item) {
		this.item = item;
	}
	
	/**
	 * Try to add item to ToDo list.
	 * 
	 * @param t item to add.
	 * @return whether item was successfully added.
	 */
	boolean addItem(ToDo t) {
		boolean temp;
		try {
			temp = list.add(t);
		} catch (Exception e) {
			temp = false;
		}
		return temp;
	}
	
	/**
	 * Get description of item on ToDo list.
	 * 
	 * @return description of ToDo item.
	 */
	static String outString(int index) {
		String str = list.get(index).getItem();
		return str;
	}
	
	/**
	 * Write entire list to specified.
	 * 
	 * @param fileName is name of file receiving output.
	 * @return whether write was successful.
	 */
	protected static boolean write(String fileName) {
		boolean temp = false;
		try {
			String fullName = "\\willisjp\\temp\\" + fileName;
			File file = new File(fullName);
			file.createNewFile();
			FileWriter writer = new FileWriter(fullName);
			for (int i = 0; i < list.size(); i++) {
				writer.write(outString(i) + "\n");
			}
			writer.close();
			temp = true;
		} catch (IOException e) {
			temp = false;
			e.printStackTrace();
		}
		return temp;
	}
	
	/**
	 * Read info from file.
	 * 
	 * @param fileName name of source file.
	 * @return
	 */
	boolean read(String fileName) {
		// TODO
		return false;
	}
	
}
