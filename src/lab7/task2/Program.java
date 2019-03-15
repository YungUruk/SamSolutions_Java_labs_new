package lab7.task2;

public class Program {
    public static void main(String[] args) {
        System.out.println(Week.MONDAY.getAbbreviation());
        if(Week.SATURDAY.isWeekend()||Week.SUNDAY.isWeekend()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        Week week=Week.valueOf(" awd");
        switch (week) {
            case SUNDAY:
                break;
            case MONDAY:
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
            case THURSDAY:
                break;
            case FRIDAY:
                break;
            case SATURDAY:
                break;
        }
    }
    enum Week{
        SUNDAY("sun"),
        MONDAY("mon"),
        TUESDAY("tue"),
        WEDNESDAY("wed"),
        THURSDAY("thur"),
        FRIDAY("fri"),
        SATURDAY("sat");
        String abbreviation;
        Week(String abbreviation){
            this.abbreviation=abbreviation;
        }
        public String getAbbreviation(){
            return this.abbreviation;
        }

        public String getText(){return this.name();}
        public boolean isWeekend(){
            return this.equals(Week.SATURDAY)||this.equals(Week.SUNDAY);
        }
    }
}
