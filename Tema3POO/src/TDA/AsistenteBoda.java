package TDA;

public class AsistenteBoda {

	private String Nom;
	private byte Edad;
	private char Sexo;
	private char EstdCivil;

	public AsistenteBoda() {}

	public AsistenteBoda(String nom, byte edad, char sexo, char estdCivil) {
		this.Nom = nom;
		this.Edad = edad;
		this.Sexo = sexo;
		this.EstdCivil = estdCivil;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public byte getEdad() {
		return Edad;
	}

	public void setEdad(byte edad) {
		Edad = edad;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}

	public char getEstdCivil() {
		return EstdCivil;
	}

	public void setEstdCivil(char estdCivil) {
		EstdCivil = estdCivil;
	}

	@Override
	public String toString() {
		return "AsistenteBoda [Nom=" + Nom + ", Edad=" + Edad + ", Sexo=" + Sexo + ", EstdCivil=" + EstdCivil+ "]";
	}
	/*
	private String EstadoCivil () {
		String EC="";
		
		switch (A) {
		
		case 'a':
		case 'A': EC="Soltero/a"; break;
		case 'b':
		case 'B': EC="Casado/a"; break;
		
		} 
		return EC;
	}
	*/
}
