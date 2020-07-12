import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class File_input_output {

	public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw = new PrintWriter("File 1.txt");
	pw.print("hi");
	pw.println("hihihihihihihiihieroimskfnjsdfkmsd");
	pw.print("hihihihihihihiihieroimskfnjsdfkmsd");
	pw.close();
	}

}
