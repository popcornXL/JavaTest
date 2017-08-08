package thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest implements Serializable{
	transient int i=2;
	static transient int j = 4;
	int k =6;
	
	public static void main(String[] args) {
		String fileName1 = "C:\\TestFile.txt";
		SerializableTest obj = new SerializableTest();
		obj.i = 3;
		obj.j = 5;
		obj.k = 7;
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName1);
			ObjectOutputStream objo = new ObjectOutputStream(fos);
			objo.writeObject(obj);
			
			FileInputStream fis = new FileInputStream(fileName1);
			ObjectInputStream obji = new ObjectInputStream(fis);
			SerializableTest obj1 =(SerializableTest) obji.readObject();
			System.out.println(obj1.i + " " + obj1.j + " " + obj1.k);
			/*
			 *  output   i=0,j=5,k=7 
			 *  obj.i 因為有加上修飾字  transient ，所以序列化寫入檔案　TestFile.txt 並沒有存入值.
			 *	obj.k 因為未加上修飾字  transient ，所以序列化後，給的值會存入檔案　TestFile.txt 中 .
			 *  obj.j 因為修飾字  transient 對static變數是無效的，所以值依然可以帶入檔案　TestFile.txt 中 .
			 */
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
