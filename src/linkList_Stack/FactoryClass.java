package linkList_Stack;

public class FactoryClass {
	
	
	private static FindDayWithSevenObject ref_sing1;
	private static FindDayWithSevenObject ref_sing2;
	private static FindDayWithSevenObject ref_sing3;
	private static FindDayWithSevenObject ref_sing4;
	private static FindDayWithSevenObject ref_sing5;
	private static FindDayWithSevenObject ref_sing6;
	private static FindDayWithSevenObject ref_sing7;
	private static FindDayWithSevenObject ret_sing;
	private static String ret_dayOnOne;
	private static int dayCnt;
	private static int index;
	
	public static FindDayWithSevenObject getInstance(int date, String dayOnOne) {
		String ret_dayOnOne = "";
		//String key = "one";
		String daysName = "Sunday Monday Tuesday Wednesday Thursday Friday Saturday";
		String[] dayArr = daysName.split(" ");
		if (date > 31 || date < 1) {
			System.out.println("please enter valid date(between 1 and 31(inclusive))");
			
		} else {
			int n = date % 7;

			for (int j = 0; j < dayArr.length; j++) {
				if (dayArr[j].trim().equalsIgnoreCase(dayOnOne)) {
					ret_dayOnOne=null;
					index = j;
					int p = n + index-1;
					if (p < 7) {
						dayCnt = p;
					} else {
						dayCnt = p - 7;
					}
					
					switch (dayCnt) {
					
					case 0:
						ret_dayOnOne = "one";
						break;
					case 1:
						ret_dayOnOne = "two";
						break;
					case 2:
						ret_dayOnOne = "three";
						break;
					case 3:
						ret_dayOnOne = "four";
						break;
					case 4:
						ret_dayOnOne = "five";
						break;
					case 5:
						ret_dayOnOne = "six";
						break;
					case 6:
						ret_dayOnOne = "seven";
						break;
					default:
						ret_dayOnOne = "eight";
						break;
					}
					

				} 

			}
		}

		switch (ret_dayOnOne) {
		case "one":
			ref_sing1 = new FindDayWithSevenObject(dayArr[0]);
			ret_sing = ref_sing1;
			break;
		case "two":
			ref_sing2 = new FindDayWithSevenObject(dayArr[1]);
			ret_sing = ref_sing2;
			break;
		case "three":
			ref_sing3 = new FindDayWithSevenObject(dayArr[2]);
			ret_sing = ref_sing3;
			break;
		case "four":
			ref_sing4 = new FindDayWithSevenObject(dayArr[3]);
			ret_sing = ref_sing4;
			break;
		case "five":
			ref_sing5 = new FindDayWithSevenObject(dayArr[4]);
			ret_sing = ref_sing5;
			break;
		case "six":
			ref_sing6 = new FindDayWithSevenObject(dayArr[5]);
			ret_sing = ref_sing6;
			break;
		case "seven":
			ref_sing7 = new FindDayWithSevenObject(dayArr[6]);
			ret_sing = ref_sing7;
			break;

		default:
			ret_sing=null;
           
			break;
		}
		return ret_sing;
	}

	public static FindDayWithSevenObject getInstance(int date) {
		String ret_dayOnOne = "";
		//String key = "one";
		String daysName = "Sunday Monday Tuesday Wednesday Thursday Friday Saturday";
		String[] dayArr = daysName.split(" ");
		if (date > 31 || date < 1) {
			System.out.println("please enter valid date(between 1 and 31(inclusive))");
			
		} else {
			int n = date % 7;
			int p = n + index-1;
			
			if (p < 7) {
				dayCnt = p;
			} else {
				dayCnt = p - 7;
			}
			
			switch (dayCnt) {
					
					
					case 0:
						ret_dayOnOne = "one";
						break;
					case 1:
						ret_dayOnOne = "two";
						break;
					case 2:
						ret_dayOnOne = "three";
						break;
					case 3:
						ret_dayOnOne = "four";
						break;
					case 4:
						ret_dayOnOne = "five";
						break;
					case 5:
						ret_dayOnOne = "six";
						break;
					case 6:
						ret_dayOnOne = "seven";
						break;
					default:
						ret_dayOnOne = "enight";
						break;
					}
					

				} 

		/*	}
		}*/

		switch (ret_dayOnOne) {
		case "one":
			ref_sing1 = new FindDayWithSevenObject(dayArr[0]);
			ret_sing = ref_sing1;
			break;
		case "two":
			ref_sing2 = new FindDayWithSevenObject(dayArr[1]);
			ret_sing = ref_sing2;
			break;
		case "three":
			ref_sing3 = new FindDayWithSevenObject(dayArr[2]);
			ret_sing = ref_sing3;
			break;
		case "four":
			ref_sing4 = new FindDayWithSevenObject(dayArr[3]);
			ret_sing = ref_sing4;
			break;
		case "five":
			ref_sing5 = new FindDayWithSevenObject(dayArr[4]);
			ret_sing = ref_sing5;
			break;
		case "six":
			ref_sing6 = new FindDayWithSevenObject(dayArr[5]);
			ret_sing = ref_sing6;
			break;
		case "seven":
			ref_sing7 = new FindDayWithSevenObject(dayArr[6]);
			ret_sing = ref_sing7;
			break;

		default:
			ret_sing=null;
           
			break;
		}
		return ret_sing;
}
}