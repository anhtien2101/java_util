
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		// Lay ra thong tin ve ngay hom nay
		Date today = (Date) calendar.getTime();
		System.out.println("Today is: " + today);
		// Lay ra loai lich dang su dung
		String calendarType = calendar.getCalendarType();
		System.out.println("Type of calendar: " + calendarType);
		// Lay ra ngay trong thang
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Ngay trong thang: " + dayOfMonth);
		//lay ra thu trong tuan
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("Thu trong tuan: " + day);
		// set lai ngay thang
		calendar.set(1994,05,01);
		System.out.println("Ngay thang sau khi set " + calendar.getTime());
		
	}

}
