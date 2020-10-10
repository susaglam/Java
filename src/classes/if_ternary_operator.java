package classes;

public class if_ternary_operator {

	public static void main(String[] args) {

		String move;
		boolean isactive = true;

		if (isactive) {
			move = "Movement started";
		} else {
			move = "No Movement";
		}
		System.out.println(move);

		move = (isactive) ? "Movement Started 2" : "No Movement 2";
		System.out.println(move);

	}

}
