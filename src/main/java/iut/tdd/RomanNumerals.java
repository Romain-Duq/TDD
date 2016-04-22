package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String nombre = "";
		Integer nb = Integer.parseInt(arabe);
		
		String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

		for(int i = 0; i < romanValues.length ; i++){
			while (nb / (romanValues[i]) > 0) {
				nombre += romanSymbols[i];
				nb = nb - romanValues[i];
			}
		} 
		
		return nombre;
	}

	public String convertFromRoman(String roman) {
		return "1";
	}

}

    

