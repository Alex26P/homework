package project.calories.model;

import java.io.Serializable;

public class FoodLog implements Serializable {

	private static final long serialVersionUID = 1L;
	private int ziua;
	private int luna;
	private int anul;
	private int ora;
	private String aliment;
	private int cantitate;
	private String unitate;

	public FoodLog(int ziua, int luna, int anul, int ora, String aliment, int cantitate, String unitate) {
		this.ziua = ziua;
		this.luna = luna;
		this.anul = anul;
		this.ora = ora;
		this.aliment = aliment;
		this.cantitate = cantitate;
		this.unitate = unitate;
	}

	public void edit(String aliment2, int cantitate2, String unitate2) {
		aliment = aliment2;
		cantitate = cantitate2;
		unitate = unitate2;
	}

	public int getZiua() {
		return ziua;
	}

	public void setZiua(int ziua) {
		this.ziua = ziua;
	}

	public int getLuna() {
		return luna;
	}

	public void setLuna(int luna) {
		this.luna = luna;
	}

	public int getAnul() {
		return anul;
	}

	public void setAnul(int anul) {
		this.anul = anul;
	}

	public int getOra() {
		return ora;
	}

	public void setOra(int ora) {
		this.ora = ora;
	}

	public String getAliment() {
		return aliment;
	}

	public void setAliment(String aliment) {
		this.aliment = aliment;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public String getUnitate() {
		return unitate;
	}

	public void setUnitate(String unitate) {
		this.unitate = unitate;
	}

	@Override
	public String toString() {
		return "FoodLog [ziua=" + ziua + ", luna=" + luna + ", anul=" + anul + ", ora=" + ora + ", aliment=" + aliment
				+ ", cantitate=" + cantitate + ", unitate=" + unitate + "]";
	}

}