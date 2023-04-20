package medium;

import java.util.Arrays;

public class SolveEquation {
	public String solveEquation(String equation) {
		String[] strArray = equation.split("-|\\+|\\=");
		int leftValue = 0;
		String leftX = "";
		int middleIndex = 0;
		int rightValue = 0;
		String rightX = "";
		System.out.println(Arrays.toString(strArray));
		for(int i = 0; i < strArray.length; i++){
			if(strArray[i].equals("=")){
				middleIndex = i+1;
				break;
			}
			if(strArray[i].equals("x")){
				leftX += "x";
			}else if(strArray[i].equals("-") || strArray[i].equals("+")){
				continue;
			}else{
				if((i > 0 && strArray[i-1].equals("+")) || i == 0){
					leftValue += Integer.parseInt(strArray[i-1]);
				}else{
					leftValue -= Integer.parseInt(strArray[i-1]);
				}
			}
		}
		for(int i = middleIndex; i < strArray.length; i++){
			if(strArray[i].equals("x")){
				rightX += "x";
			}else if(strArray[i].equals("-") || strArray[i].equals("+")){
				continue;
			}else{
				if((i > middleIndex && strArray[i-1].equals("+")) || i == middleIndex){
					rightValue += Integer.parseInt(strArray[i-1]);
				}else{
					rightValue -= Integer.parseInt(strArray[i-1]);
				}
			}
		}
		System.out.println("leftValue : " +leftValue + "leftX : " +leftX);
		System.out.println("rightValue : " +rightValue + "rightX : " +rightX);
		return "";
		
	}
}
