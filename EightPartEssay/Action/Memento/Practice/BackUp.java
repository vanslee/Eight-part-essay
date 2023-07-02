package EightPartEssay.Structure.Memento.Practice;

public class BackUp {
    private String content;
    private Integer version;

    public BackUp(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}
