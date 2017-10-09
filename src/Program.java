import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

public class Program {
	
	// About git commits

	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		FileOutputStream file2 = new FileOutputStream("file2.txt");
		File secondfile = new File("ReadFile.txt");
		
		System.out.println("File name: " + file.getName());
		System.out.println("Path: " + file.getPath());
		System.out.println(file.exists() ? "exists" : "does not exist");
		System.out.println("File size: " + file.length() + " bytes");
		
		// Import text to a file: 
		String fileTextContent = "Hello world, its a lovley day outside!";
		byte buf[] = fileTextContent.getBytes();
		
		OutputStream outStream = new FileOutputStream(file);
		outStream.write(fileTextContent.getBytes());
		outStream.close();
		
		for (int i = 0; i < buf.length; i +=2) {
			file2.write(buf);
		}
		
		// Read a file:
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(secondfile)));
		String text = reader.readLine();
		while (text != null) {
			System.out.println(text);
			text = reader.readLine();
		}
		
		
		// Read from URL;
//		URL url = new URL("http://www.gutenberg.org/files/2265/2265.txt");
//		InputStream stream = url.openStream();
//		
//		BufferedReader UrlReader = new BufferedReader(new InputStreamReader(stream));
//		String input = UrlReader.readLine();
//		while (input!= null) {
//			System.out.println(input);
//			input = UrlReader.readLine();
//		}
	}

}
