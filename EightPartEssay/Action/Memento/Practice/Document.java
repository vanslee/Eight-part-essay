package EightPartEssay.Structure.Memento.Practice;

public class Document {
    String content;
    String otherContent;

    //
    public BackUp save() {
        System.out.println("保存备份");
        return new BackUp(content);
    }

    //
    public void resume(BackUp b) {
        System.out.println("恢复备份");
        this.content = b.getContent();
    }

    @Override
    public String toString() {
        return "Document [content=" + content + ", otherContent=" + otherContent + "]";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOtherContent() {
        return otherContent;
    }

    public void setOtherContent(String otherContent) {
        this.otherContent = otherContent;
    }

}
