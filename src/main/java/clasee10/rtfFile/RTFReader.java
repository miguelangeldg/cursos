package clasee10.rtfFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.rtf.RTFEditorKit;

public class RTFReader {
	
	public static void main(String[] args) {
		
		File fEntrada = new File("E:" + File.separator + "ficheros" + File.separator + "leer.rtf");
		File fSalida = new File("E:" + File.separator + "ficheros" + File.separator + "salida.rtf");
		
		String result = null;
		
		try {	    
			FileInputStream fis = new FileInputStream(fEntrada);
			FileOutputStream fos = new FileOutputStream(fSalida);			
			
		    DefaultStyledDocument styledDoc = new DefaultStyledDocument();		    
		    new RTFEditorKit().read(fis, styledDoc, 0);
		    result = new String( styledDoc.getText(0, styledDoc.getLength()).getBytes("ISO8859_1") );		    
		    System.out.print(result);
		    
		    fos.write(fis.readAllBytes());
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		
	}

}
