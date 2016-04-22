package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int[] tab = new int[]{1000, 500, 100, 50, 10, 5};
		String[] res = new String[]{"M", "D,", "C", "L", "X", "V"};
		
		
		int initial = Integer.valueOf(arabe);
		int next = initial;
		String result = "";
		
		for (int i=0; i<tab.length;i++) {
			do {
				next = initial % tab[i];
				if (next < initial) {
					result += res[i];
					initial -= tab[i];
				}
			} while (initial % tab[i] >= tab[i]);
			
			if (initial == tab[i]-1) {
				initial = initial - (tab[i]-1);
				result += "I" + res[i];
			}
		}
		
		
		if (initial == 2) {
			return "II";
		} else if (initial == 1) {
			return "I";
		}
		return result;
	}

	public String convertFromRoman(String roman) {
		
		String nb = "";
		int n = 0;
		for(int i = 0; i<roman.length();i++){
			
			if(roman.charAt(i) == 'I'){
				n+=1;
			}else if(roman.charAt(i) == 'I' && roman.charAt(i+1) == 'V'){
				n+=4;
			}
		}
		nb+=n;
		return nb;
	}

}
