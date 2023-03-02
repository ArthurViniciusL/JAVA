package equals_e_hashcode;

import java.util.Objects;

public class Usuario {
	String nome;
	String email;
	
	// implementando o equals
	@Override
	public boolean equals(Object obj) {

		boolean saida = false;

		if (obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			boolean nomeIgual = outro.nome == this.nome;
			boolean emailIgual = outro.email == this.email;
			// return nomeIgual && emailIgual;
			saida = true;
		}
		return saida;
	}

	@Override
	public int hashCode() {

		return this.nome.length();
	}
	
	// Criado pelo eclipse:
	/*
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	*/
	

}
