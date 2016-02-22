import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khoi tao mot date
		Date currentTime = new Date();
		System.out.println("Current time: " + currentTime);
		// Lay ra so mili giay da troi qua tu 1/1/1970
		System.out.println("Mili giay troi qua: " + currentTime.getTime());
		// su dung SimpleDateFormat de dinh dang lai kieu thoi gian
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		// Khoi tao 2 date khac nhau de so sanh
		Date date1 = null;
		Date date2 = null;
		try {
			date1 = simpleDateFormat.parse("22/12/2015 10:20:35");
			date2 = simpleDateFormat.parse("22/12/2015 10:11:24");
			// so sanh xem date1 co truoc date2 khong
			boolean isBefore = date1.before(date2);
			if(isBefore){
				System.out.println("Date1 truoc Date2");
			}
			else{
				System.out.println("Date1 khong phai truoc date2");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// in date1 xa xem dung dinh dang da cai dat khong
		System.out.println("date1: " + simpleDateFormat.format(date1));
		// thiet lap mot ngay thang tu thoi gian da cho
		Date date3 = new Date();
		date3.setTime(1450668933);
		System.out.println("Dae3: " + simpleDateFormat.format(date3));
	}
}
