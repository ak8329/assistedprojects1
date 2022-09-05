
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.nio.file.StandardOpenOption;
	import java.util.Arrays;
	import java.util.List;
	public class fileappend {
	public static void createFileUsingNIO() throws IOException {
	Path path = Paths.get("C:\\Users\\Atla Venkat\\Desktop\\java\\practiceproject\\src\\practiceproject\\file.txt");
	//write data using file class 
	String input = "Welcome";
	byte array[] = input.getBytes();
	Files.write(path, array, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	System.out.println("this is krishna");
	Path path1 = Paths.get("C:\\Users\\Atla Venkat\\Desktop\\java\\practiceproject\\src\\practiceproject\\file.txt");
	List<String> list = Arrays.asList("txt1", "txt2");
	Files.write(path1, list, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	System.out.println("who is an employeee");
	}
	public static void main(String[] args) {
	try {
	createFileUsingNIO();
	} catch (IOException e) {
	e.printStackTrace();
	}
	}
	
}