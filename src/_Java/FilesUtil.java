/**
 * 
 */
package _Java;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * @author whoze
 * 
 */
public class FilesUtil {
	public static void main(String[] args) {
		System.out.println(".0.0.");
	List<File>lf=	(List<File>) FileUtils.listFiles(new File("C:\\"), new String[] { ".txt" },
				true);
	System.out.println(".1.1.");
	System.out.println(lf);
	for(File f:lf){
		System.out.println(f.getAbsolutePath());
	}
	}
}
