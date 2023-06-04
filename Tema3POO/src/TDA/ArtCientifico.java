package TDA;

public class ArtCientifico {

	private String NomArt;
	private String Autor;
	private String PalbClave;
	private String NomPublica;
	private int Año;
	private String Resumen;
	
	
	
	
	public ArtCientifico() {}
	
	public ArtCientifico(String nomArt, String autor) {
		NomArt = nomArt;
		Autor = autor;
	}
	public ArtCientifico(String nomArt, String autor, String palbClave, int año) {
		NomArt=nomArt;
		Autor=autor;
		PalbClave = palbClave;
		Año = año;
	}
	public ArtCientifico(String nomArt, String autor, String palbClave, String nomPublica, int año, String resumen) {
		this(nomArt,autor,palbClave,año);
		this.NomPublica = nomPublica;
		this.Resumen = resumen;
	}
	public String getNomArt() {
		return NomArt;
	}
	public void setNomArt(String nomArt) {
		NomArt = nomArt;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getPalbClave() {
		return PalbClave;
	}
	public void setPalbClave(String palbClave) {
		PalbClave = palbClave;
	}
	public String getNomPublica() {
		return NomPublica;
	}
	public void setNomPublica(String nomPublica) {
		NomPublica = nomPublica;
	}
	public int getAño() {
		return Año;
	}
	public void setAño(int año) {
		Año = año;
	}
	public String getResumen() {
		return Resumen;
	}
	public void setResumen(String resumen) {
		Resumen = resumen;
	}
	
	public String toString() {
		return "Articulos Cientifico"+"\nTitulo= " + NomArt + "\nAutor= " + Autor + "\npalabra Clave= " + PalbClave + "\nPublicacion= "
				+NomPublica+"\nAño= " +Año+"\nResumen= " + Resumen;
	}
	

}
