import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
public class IOtest {

	public static void main(String[] args) throws IOException {
		String filename="D:"+File.separator+"hellJava.txt";
		File file =new File(filename);
		Writer out=new FileWriter(file,true);
		String b="";
		out.write(b);
		out.close();
	}
}
