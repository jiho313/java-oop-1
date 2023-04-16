package sample4_static;

public class CommonUtilsApp {

	public static void main(String[] args) {
		String text1 = CommonUtils.dateToString("yyyy.MM.dd");
		String text2 = CommonUtils.dateToString("M/d.EEE");
		String text3 = CommonUtils.dateToString("yyyy년 M월 d일 EEEE a h시 m분");

		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
	}

}
