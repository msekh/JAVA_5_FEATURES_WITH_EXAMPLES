import java.util.ArrayList;
import java.util.List;

public class ClientTest {
public static void main(String args[]) {
	List list=new ArrayList();
	list.add("Sekh");
	list.add("Mahadi");
	list.add("Maenul");
	list.add(100);
	
	//System.out.println((String)list.get(3));
	
	for(Object obj: list) {
		if(obj instanceof String) {
			String name=(String)obj;
			System.out.println(name);
		}else if(obj instanceof Integer){
			Integer i=(Integer)obj;
			System.out.println(i);
		}
	}
}
}
