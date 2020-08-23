package com.controller;

public class GetterSetter {
	
	private String ingridient1;
	private String ingridient2;
	private String ingridient3;
	
	private String diet;
	
	private String cuisine;
	
	private String food;
	
	public GetterSetter() {
		super();
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getIngridient1() {
		return ingridient1;
	}
	public void setIngridient1(String ingridient1) {
		this.ingridient1 = ingridient1;
	}
	public String getIngridient2() {
		return ingridient2;
	}
	
	public void setIngridient2(String ingridient2) {
		this.ingridient2 = ingridient2;
	}
	public String getIngridient3() {
		return ingridient3;
	}
	public void setIngridient3(String ingridient3) {
		this.ingridient3 = ingridient3;
	}

	
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	public GetterSetter(String ingridient1, String ingridient2, String ingridient3, String diet, String cuisine) {
		super();
		this.ingridient1 = ingridient1;
		this.ingridient2 = ingridient2;
		this.ingridient3 = ingridient3;
		this.diet = diet;
		this.cuisine = cuisine;
	}
	
	
	

	public GetterSetter(String ingridient1, String ingridient2, String ingridient3, String diet, String cuisine,
			String food
			) {
		super();
		this.ingridient1 = ingridient1;
		this.ingridient2 = ingridient2;
		this.ingridient3 = ingridient3;
		this.diet = diet;
		this.cuisine = cuisine;
		this.food = food;
	}
	@Override
	public String toString() {
		return "GetterSetter [ingridient1=" + ingridient1 + ", ingridient2=" + ingridient2 + ", ingridient3="
				+ ingridient3 + ", diet=" + diet + ", cuisine=" + cuisine + ", food=" + food + "]";
	}
	
}

