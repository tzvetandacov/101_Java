package week07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;
public class FileUtils {
	private static FileUtils instance;

	private FileUtils() {

	}

	public static FileUtils getInstance() {
		if (instance == null) {
			instance = new FileUtils();
		}
		return instance;
	}

	public String readFrom(File file) throws IOException {
		String line;
		StringBuilder builder = new StringBuilder();
		BufferedReader buf = new BufferedReader(new FileReader(file));
		while((line = buf.readLine()) != null){
			builder.append(line);
			builder.append(System.lineSeparator());
		}
		return builder.toString();

	}
}
