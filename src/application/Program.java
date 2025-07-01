package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o caminho da pasta: ");		
		String stringPath = entrada.nextLine();
		
		File path = new File(stringPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file: files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		boolean success = new File(stringPath + "\\subdir").mkdir();
		
		if(success) {
			System.out.println("Subpasta criada com sucesso. "+success);
		}
		
		entrada.close();
	}
}