package linkList_Stack;

public class TestFactoryPattern {

	public static void main(String[] args) {
		FindDayWithSevenObject sc1 = FactoryClass.getInstance(1, "Friday");
		FindDayWithSevenObject sc2 = FactoryClass.getInstance(3);
		FindDayWithSevenObject sc4 = FactoryClass.getInstance(4);
		FindDayWithSevenObject sc5 = FactoryClass.getInstance(31);
		FindDayWithSevenObject sc6 = FactoryClass.getInstance(5);
		FindDayWithSevenObject sc7 = FactoryClass.getInstance(32);
		FindDayWithSevenObject sc8 = FactoryClass.getInstance(-1);
	}

}
