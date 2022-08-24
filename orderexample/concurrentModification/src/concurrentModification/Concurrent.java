package concurrentModification;

import java.util.ArrayList;
import java.util.List;

public class Concurrent {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Before Modification");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		/*
		 * for (Integer integer : list) { System.out.println(integer);
		 * if(integer.equals(3)) { list.remove(integer); } }
		 */
		System.out.println("After Modification");
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).equals(3)) {
				list.remove(i);
				list.add(6);
			}
			
			System.out.println(list.get(i));

		}
	}

}
