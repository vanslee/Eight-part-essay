package EightPartEssay.Structure.Memento.Practice;

import java.util.LinkedList;

public class VersionControlSystem {
    public LinkedList<BackUp> backups = new LinkedList<>();
    public Integer nextVersoin = 0;

    public void add(BackUp backUp) {
        backUp.setVersion(++nextVersoin);
        backups.add(backUp);
    }

    public BackUp get(Integer version) {
        for (BackUp item : backups) {
            if (item.getVersion() == version) {
                return item;
            }
        }
        return null;
    }

    public BackUp getLastVersion() {
        return this.backups.getLast();
    }
}
