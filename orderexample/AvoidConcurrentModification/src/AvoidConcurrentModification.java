import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrentModification {
	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		for (Integer integer : list) {
			
			if (integer.equals(3)) {
				list.remove(integer);
			}
			
		}
		System.out.println(list);
	}
}
