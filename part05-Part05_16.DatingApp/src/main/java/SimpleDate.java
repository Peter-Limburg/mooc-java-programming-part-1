
public class SimpleDate {

    private int day;
    private int month;
    private int year;


    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day++;
        if (this.day > 30) {
            this.day = 1;
            this.month++;
            if (month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

        public void advance(int howManyDays){
            int dayCount = this.day + howManyDays;
            if (dayCount <= 30) {
                this.day += howManyDays;
            } else if (dayCount > 30) {
                this.day = dayCount - 30;
                this.month += 1;
                if (month > 12) {
                    this.month = 1;
                    this.year++;
                }
            }
        }

        public SimpleDate afterNumberOfDays(int days) {
            int newDay = this.day;
            int newMonth = this.month;
            int newYear = this.year;

            int afterDate = newDay + days;

            if (afterDate > 30) {
                while (afterDate > 30) {
                    afterDate = afterDate - 30;
                    newMonth += 1;
                    if (newMonth > 12) {
                        newMonth = 1;
                        newYear++;
                    }
                }
            }
                return new SimpleDate(afterDate, newMonth, newYear);
            }
        }



