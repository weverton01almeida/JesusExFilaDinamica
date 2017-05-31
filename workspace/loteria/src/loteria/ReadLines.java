package loteria;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class ReadLines {
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		int contaTABLE = 0;
		int contaTR = 0;
		int contaTD = 0;

		try {
			inputStream = new BufferedReader(new FileReader("D_LOTFAC.HTM"));
			outputStream = new PrintWriter(new FileWriter("D_LOTFAC.BAK"));

			String l;
			while ((l = inputStream.readLine()) != null) {
				// Encontrou a palavra "table"
				if (l.indexOf("table") != -1) {
					contaTR = 0;
					System.out.println(l);
					contaTABLE++;
				}
				// Primeira table encontrada
				if (contaTABLE == 1) {
					
					if (l.indexOf("<tr") != -1) {
						contaTD = 0;
						contaTR++;
					}
					
					// Primeira TR encontrada
					if (contaTR == 1) {
						System.out.println(l);
					}
					
					if (contaTR > 1) {
						
						if (l.indexOf("<tr") != -1) {
							System.out.println(l);
						}
						
						if (l.indexOf("<td") != -1) 
							contaTD++;
						
						if (contaTD > 0) {
							System.out.println(l);
						}
						
					}
					
					
				}
				// outputStream.println(l);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}