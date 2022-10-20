package medium;

public class IntToRoman {
	public String intToRoman(int num) {
		int[] getNumberArray = getNumber(num);
		StringBuilder sb = new StringBuilder();
		sb.append(getThousandRoman(getNumberArray[0]));
		sb.append(getHundreadRoman(getNumberArray[1]));
		sb.append(getTenRoman(getNumberArray[2]));
		sb.append(getOneRoman(getNumberArray[3]));
        return sb.toString();
    }
	
	private int[] getNumber(int num) {
		int mot = 1;
		int ans = 0;
		int j = 0;
		int[] ansArray = new int[4];
		for(int i = 3; i >= 0; i--) {
			mot = (int)Math.pow(10, i);
			ans = (num/mot)*mot;
			ansArray[j] = ans;
			num -= ans;
			j++;
		}
		return ansArray;
	}
	
	private String getThousandRoman(int num) {
		if(3000 == num) {
			return "MMM";
		}
		else if(2000 == num) {
			return "MM";
		}
		else if(1000 == num) {
			return "M";
		}
		return "";
	}
	
	private String getHundreadRoman(int num) {
		if(100 == num) {
			return "C";
		}
		else if(200 == num) {
			return "CC";
		}
		else if(300 == num) {
			return "CCC";
		}
		else if(400 == num) {
			return "CD";
		}
		else if(500 == num) {
			return "D";
		}
		else if(600 == num) {
			return "DC";
		}
		else if(700 == num) {
			return "DCC";
		}
		else if(800 == num) {
			return "DCCC";
		}
		else if(900 == num) {
			return "CM";
		}
		return "";
	}

	private String getTenRoman(int num) {
		if(10 == num) {
			return "X";
		}
		else if(20 == num) {
			return "XX";
		}
		else if(30 == num) {
			return "XXX";
		}
		else if(40 == num) {
			return "XL";
		}
		else if(50 == num) {
			return "L";
		}
		else if(60 == num) {
			return "LX";
		}
		else if(70 == num) {
			return "LXX";
		}
		else if(80 == num) {
			return "LXXX";
		}
		else if(90 == num) {
			return "XC";
		}
		return "";
	}

	private String getOneRoman(int num) {
		if(1 == num) {
			return "I";
		}
		else if(2 == num) {
			return "II";
		}
		else if(3 == num) {
			return "III";
		}
		else if(4 == num) {
			return "IV";
		}
		else if(5 == num) {
			return "V";
		}
		else if(6 == num) {
			return "VI";
		}
		else if(7 == num) {
			return "VII";
		}
		else if(8 == num) {
			return "VIII";
		}
		else if(9 == num) {
			return "IX";
		}
		return "";
	}
}
