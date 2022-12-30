package tp03;

import structures.Heap;

public class Main {

	public static void main(String[] args) {
		Heap hip = new Heap(args);
		String[] tas = hip.sort();
		int count = args.length;
		System.out.println(count);
		for (int i=0;i<count; i++) {
			System.out.println(tas[i]);
		}
			

	}

}
