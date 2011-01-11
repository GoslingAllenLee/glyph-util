package reshaper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

import com.ahmadiv.dari.DariGlyphUtils;

public class XMLReshaper {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String outputFile = "out.xml";
		String inputFile = "xdata.xml";
		/** Handling XML */
		BufferedWriter writer = null;
		try {


			Reader in = new InputStreamReader(new FileInputStream(inputFile), "UTF-8");
			BufferedReader reader = new BufferedReader(in); 
			
			writer = new BufferedWriter(new OutputStreamWriter
                    (new FileOutputStream(outputFile),"UTF8"));
			String line = "";
			long time = System.currentTimeMillis();
			while((line = reader.readLine()) != null){
				writer.write(DariGlyphUtils.reshapeText(line));
			}
			System.out.println("Shaped in (ms): "+(System.currentTimeMillis() - time));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer != null){
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
