import java.util.*;

public class MapTest {
	public static void main(String[] args){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Satu");
		map.put(2, "Dua");
		System.out.println(map.get(1));
		Set<Integer> key = map.keySet();
	}
}