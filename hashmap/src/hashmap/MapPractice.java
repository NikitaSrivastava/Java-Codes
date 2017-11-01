package hashmap;

import java.util.Map;
import java.util.HashMap;

public class MapPractice {
public static void main(String []args){
	Map<Integer,Entity>map=new HashMap<>();
	map.put(1,new Entity(10,"nikita"));
	map.put(2,new Entity(10,"ni1"));
	map.put(2,new Entity(10,"nikita2"));
	map.put(3,new Entity(10,"nikita3"));
	System.out.println(map.get(1));	
	
}
}
