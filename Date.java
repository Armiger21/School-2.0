public class Date {
   private int year;
   private int month;
   private int day;
   
   final int[] daysInMonths = 
      {31,28,31,30,31,30,31,31,30,31,30,31};
   
   public Date(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }
   
   public int daysInMonth(int month) {
      return daysInMonths[month - 1];
   }
   
   public int getDay() {
      return day;
   }
   
   public int getMonth() {
      return month;
   }
   
   public int getYear() {
      return year;
   }
   
   public String toString() {
      return String.format("%04d", year) + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);
   }
   
   public void addDays(int days) {
      if (daysInMonth(month) > day + days) {
         this.day = getDay() + days;
      }
      else {
         int totalDays = getDay() + days;
         while (totalDays > daysInMonth(month)) {
            totalDays = totalDays - daysInMonth(month);
            this.month += 1;
            if (getMonth() == 13) {
               this.month = 1;
               this.year += 1;
            }
         }
         this.day = totalDays;
      }
   }
   
   public void addWeeks(int weeks) {
      addDays(weeks *7);
   }
   
   public int daysTo(Date date) {
      int newDay = date.day;
      int newMonth = date.month;
      int newYear = date.year;
      int totalDays = 0;
      

      while (newYear > year && newMonth > month && newDay > day) {
         totalDays += 365;
         if (date.isLeapYear()) {
            totalDays += 1;
         }
         newYear--;
      }
      
      while (month != newMonth) {
         newMonth--;
         if (newMonth == 0) {
            newMonth = 12;
         }
         totalDays += daysInMonth(newMonth);   
      }
      
      if (month == newMonth) {
         totalDays += newDay - day;
      }
      
      return totalDays;
   }
   
   public boolean isLeapYear() {
      if (year % 100 == 0) {
         return year % 400 == 0;
      }
      else {
         return year % 4 == 0;
      }
   }
   
   public boolean equals(Date o) {
      if (o instanceof Date) {
         Date other = (Date)o;
         return true;
      }
      else {
         return true;
      }
   }
}