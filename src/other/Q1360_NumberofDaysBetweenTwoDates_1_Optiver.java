package other;

public class Q1360_NumberofDaysBetweenTwoDates_1_Optiver {

	    int[] _365M = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	    public int daysBetweenDates(String date1, String date2) {
	        int[] dates1 = parseDate(date1), dates2 = parseDate(date2);
	        return Math.abs(calculateDays(dates1[0], dates1[1], dates1[2]) - calculateDays(dates2[0], dates2[1], dates2[2]));
	    }

	    public int[] parseDate(String date) {
	        return new int[]{Integer.valueOf(date.substring(0, 4)), Integer.valueOf(date.substring(5, 7)), Integer.valueOf(date.substring(8, 10))};
	    }

	    public int calculateDays(int year, int month, int day) {
	        int dayC1 = day - 1;
	        for (int i = month; i > 1; i--) dayC1 += _365M[i - 1 - 1];
	        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month > 2) dayC1++;
	        dayC1 += (365 * (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);
	        return dayC1;
	    }
}

