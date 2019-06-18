package chapter9;

//日付クラスDay[第1版]
public class Day {

	// --フィールド--
	private int year ;	 //年
	private int month ;	 //月
	private int date ; 	 //日

	// --コンストラクタ--
	Day(int year , int month , int date) {
		this.year  = year ;
		this.month = month ;
		this.date = date ;
	}

	// --メソッド--
	// --年・月・日を取得-- (getter
	int getYear() { return year ; }
	int getMonth() { return month ; }
	int getDate() { return date; }

	// --年・月・日をそれぞれ設定-- (setter
	void setYear(int year) { this.year = year ; }
	void setMonth(int month) { this.month = month ; }
	void setDate(int date) { this.date = date ; }

	void set(int year, int month , int date) {
		this.year  = year ;		//年
		this.month = month ;	//月
		this.date = date ;		//日
	}

	// --曜日を求めるメソッド--
	int dayOfWeek() {
		int y = year;			//0…日曜日
		int m = month;			//1…月曜日
		if(m == 1 || m == 2) {	// :
			y--;				//5…金曜日
			m += 12;			//6…土曜日
		}
		return (y + (y / 4) - (y / 100) + (y / 400) + (13 * m + 8) / 5 + date) % 7;
	}


}
