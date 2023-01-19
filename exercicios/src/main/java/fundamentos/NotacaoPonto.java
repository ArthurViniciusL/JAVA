package fundamentos;
public class NotacaoPonto {
	//Meu método para aumentar a primeira letra da String:
	public static String toUpperCaseFirst(String val) {
		char[] lista = val.toCharArray();
		lista[0] = Character.toUpperCase(lista[0]);
		return new String(lista);
	}
	public static void main(String[] args) {
		
		String nome = "ARTHUR.";
		nome.toUpperCase(); //Não salva a alteração
		System.out.println(nome.charAt(0));
				
		nome = nome.toLowerCase(); //Salva a alteração;
		System.out.println(nome);
		
		nome = nome.replace('.', '!');
		System.out.println(nome);
		
		nome = toUpperCaseFirst(nome);
		System.out.println(nome);
		
		String s = "olá @";
		System.out.println(s);
		
		s = toUpperCaseFirst(s).concat(nome);
		System.out.println(s);
	}
}

