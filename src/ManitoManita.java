public class ManitoManita {
    public static void main(String[] args) {
        //here we create a list of the people joining
        String[] teamA={"Dylan", "Angelo", "Rudetoine", "Rodelo", "Papay", "Deion"};
        String[] teamB={"Ross", "Kaitlyn", "Gwyn", "Jannin", "Mamay", "Jambee"};

        //here we get the length or the number of people participating
        int teamALength = teamA.length;
        int teamBLength = teamB.length;

        //now we can multiply a random number with the length and get a random number!
        int rand1 = (int) (Math.random() * teamALength);
        int rand2 = (int) (Math.random() * teamBLength);

        //with this we print out our first pair yesh
        System.out.println("and the first pair is:" + teamA[rand1] + " and " + teamB[rand2]);
    }
}
