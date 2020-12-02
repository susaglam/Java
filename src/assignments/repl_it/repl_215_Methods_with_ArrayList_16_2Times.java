package assignments.repl_it;

import java.util.ArrayList;

public class repl_215_Methods_with_ArrayList_16_2Times {
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(1);
		data.add(5);
		data.add(3);
		data.add(7);
		System.out.println(twoTimes(data));
	}
	// create your method below

	public static ArrayList<Integer> twoTimes(ArrayList<Integer> data) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int d = 0;
		for (int i = 0; i < data.size(); i++) {
			for (int j = 0; j < 2; j++) {
				result.add(d, data.get(i));
				d++;
			}
		}
		return result;
	}
}
