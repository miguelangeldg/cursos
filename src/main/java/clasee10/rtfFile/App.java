package clasee10.rtfFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.rtf.RTFEditorKit;

public class App {

	public static void main(String[] args) {

		System.out.println("Inicio del programa");

//		File fEntrada = new File("/Users/alejandroluisrolon/Library/Mobile Documents/com~apple~CloudDocs/PROGRAMACION/JAVA STANDARD WEB PROGRAMMING/CLASE 10/PRUEBA ARCHIVOS/leer.rtf");
//		File fSalida = new File("/Users/alejandroluisrolon/Library/Mobile Documents/com~apple~CloudDocs/PROGRAMACION/JAVA STANDARD WEB PROGRAMMING/CLASE 10/PRUEBA ARCHIVOS/salida.rtf");

		File fEntrada = new File("E:" + File.separator + "ficheros" + File.separator + "leer.rtf");
		File fSalida = new File("E:" + File.separator + "ficheros" + File.separator + "salida.rtf");

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		String result = null;

		try {
			fis = new FileInputStream(fEntrada);
			fos = new FileOutputStream(fSalida);
			
//			fos.write(fis.readAllBytes());
			
			DefaultStyledDocument styledDoc = new DefaultStyledDocument();		    
			new RTFEditorKit().read(fis, styledDoc, 0);
			result = new String(styledDoc.getText(0, styledDoc.getLength()).getBytes("ISO8859_1"));			
			System.out.print(result);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();

		} catch (BadLocationException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		System.out.println("Fin del programa");

	}

}
