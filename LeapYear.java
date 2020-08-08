/**
isLeapYear returns true when 
year is divisible by 400 or
year is divisible by 4 and not by 100.
*/
public static boolean isLeapYear(int year){
	if (year % 400 == 0 || (year % 4 == 0 & year % 100 != 0)){
		return True
	}
	return False
}
