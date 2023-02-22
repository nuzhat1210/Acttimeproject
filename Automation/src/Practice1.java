import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Practice1 {
public static void main(String[] args) throws IOException {
	FileInputStream F=new FileInputStream("./Demo/Testdat/commondata.property");
	Properties p=new Properties();
	p.load(F);
	String A = p.getProperty("url");
	String B=p.getProperty("username");
	String C=p.getProperty("password");
	}
}
