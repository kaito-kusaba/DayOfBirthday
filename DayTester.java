package chapter9;

import java.util.Scanner;

//日付クラスDay[第1版]の利用例
public class DayTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		System.out.println("誕生日を西暦で入力せよ。");
		System.out.print("年:");
			int y = stdIn.nextInt();
		System.out.print("月:");
			int m = stdIn.nextInt();
		System.out.print("日:");
			int d = stdIn.nextInt();

		//Day型のインスタンスを生成
		Day birthday = new Day(y, m, d) ;
			System.out.println("あなたの誕生日"
						+ birthday.getYear() 	+ "年"
						+ birthday.getMonth() 	+ "月"
						+ birthday.getDate()  	+ "日は"
						+ wd[birthday.dayOfWeek()] + "曜日です。");

	}

}
