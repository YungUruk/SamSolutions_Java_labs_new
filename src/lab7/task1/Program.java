package lab7.task1;

public class Program {
    public static void main(String[] args) {
        SwimmingAthleteImpl swimmer = new SwimmingAthleteImpl();
        JumpingAthleteImpl jumper = new JumpingAthleteImpl();
        TeamPlayerImpl templayer=new TeamPlayerImpl();

        AllOverParticipantImpl a = new AllOverParticipantImpl();
        a.participate();

    }


}
