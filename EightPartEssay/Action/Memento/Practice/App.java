package EightPartEssay.Structure.Memento.Practice;

public class App {
    public static void main(String[] args) {
        VersionControlSystem vcs = new VersionControlSystem();
        Document document = new Document();
        document.setContent("content1");
        document.setOtherContent("otherContent1");
        System.out.println(document);
        vcs.add(document.save());
        document.setContent("content2");
        document.setOtherContent("otherContent2");
        System.out.println(document);
        vcs.add(document.save());
        document.setContent("content3");
        document.setOtherContent("otherContent3");
        vcs.add(document.save());
        System.out.println(document);
        document.resume(vcs.get(1));
        System.out.println(document);
        document.resume(vcs.getLastVersion());
        System.out.println(document);

    }
}
