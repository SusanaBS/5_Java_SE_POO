package com.anncode.amazonviewer.model;


/**
 * <h1>Film</h1>
 * Film es una clase padre abstracta
 * <p>
 * Esta clase es la clase base de la familia Films, como es abstracto
 * o pueden crearse instancias. Contiene en el m�todo abstracto
 * {@code view()}  que obligatorio implemnetar para todo aquel que pertenezca a la familia.
 * 
 * 
 * @author Bautista
 * @version 1.1
 * @since 2018
 * 
 * */


public abstract class Film {
	
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	
	
	public Film() {}
	public Film(String title, String genre, String creator, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String isViewed() {
		String visto = "";
		if(viewed == true) {
			visto = "S�";
		}else {
			visto = "No";
		}
		
		return visto;
	}
	
	public boolean getIsViewed() {
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	/**
	 * {@code view()} es un m�todo abstracto obligatorio de implementar
	 * 
	 * */
	
	public abstract void view();

}
