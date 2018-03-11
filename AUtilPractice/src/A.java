import java.util.Properties;
import java.util.Set;


public class A {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.version"));
		
		Properties p = System.getProperties();
		
		Set<Object> s = p.keySet();
		
		for(Object o:s){
			System.out.println(o +"----------------"+ System.getProperty((String)o));
		}
	}

}
