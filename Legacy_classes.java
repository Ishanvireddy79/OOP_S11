package practical1;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Legacy_classes {
	public static void main(String[]args) {
		Date LegacyDate = new Date();
		System.out.println("Legacy Date:"+LegacyDate);
		Calendar calendar = Calendar.getInstance();
		calendar.set(2024, Calendar.APRIL,27,10,30,0);
		Date calendarDate = calendar.getTime();
		System.out.println("Legacy Calendar Date:"+ calendarDate);
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = localDateTime.format(formatter);
		System.out.println("Formatted Modern LocalDateTime:"+ formattedDateTime);
		LocalDateTime fromLegacyDate = LegacyDate.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDateTime();
		System.out.println("converted from legacy date to LocalDateTime:"+ fromLegacyDate);
        Date fromLocalDateTime = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("Converted from LocalDateTime to Legacy Date: " + fromLocalDateTime);		
	}
}
