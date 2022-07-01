package ua.com.foxminded.carmanager;

public enum Color {
	
	BLACK ("Black"),

	ORANGE ("Orange"),

	WHITE ("White"),

	YELLOW ("Yellow"),

	BLUE ("Blue"),

	GREEN ("Green");

	String colorName;
	
	Color (String colorName) {
		this.colorName = colorName;
	}

}