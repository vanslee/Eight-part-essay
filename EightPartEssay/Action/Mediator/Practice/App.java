package EightPartEssay.Structure.Mediator.Practice;

public class App {
    public static void main(String[] args) {
        MarriageAgency agency = new MarriageAgencyLmpl();
        Man man1 = new Man("John1", 22, agency, 60);
        Man man2 = new Man("John2", 20, agency, 66);
        Woman man3 = new Woman("John3", 60, agency, 22);
        Woman man4 = new Woman("John4", 20, agency, 30);
        man1.findParner();
        man2.findParner();
        man3.findParner();
        man4.findParner();
    }
}
