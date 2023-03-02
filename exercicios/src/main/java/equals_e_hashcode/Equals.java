package equals_e_hashcode;

public class Equals {
	public static void main(String[] args) {
		Usuario user_1 = new Usuario();
		user_1.nome = "Arthur Vinícius";
		user_1.email = "Arthur@email.com";

		Usuario user_2 = new Usuario();
		user_2.nome = "Arthur Vinícius";
		user_2.email = "Arthur@email.com";

		System.out.println("== : " + (user_1 == user_2));

		System.out.println("equals() : " + user_1.equals(user_2));

		System.out.println("equals() : " + user_2.equals(user_1));
	}
}