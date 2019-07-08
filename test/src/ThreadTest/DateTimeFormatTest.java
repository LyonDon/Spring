package threadTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatTest {
	public static void main(String[] args) {
		// 解析日期
		String dateString = "2019年05月20日";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		LocalDate date = LocalDate.parse(dateString, formatter);
		System.out.println(date);
		
		// 日期转换为字符串
		LocalDateTime nowDateTime = LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy年MM月dd日 ");
		String nowString=nowDateTime.format(format);
		System.out.println(nowString);
	}
}
