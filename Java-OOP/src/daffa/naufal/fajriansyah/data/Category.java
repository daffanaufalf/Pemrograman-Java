package daffa.naufal.fajriansyah.data;

// Getter dan Setter
public class Category {
    private String id;

    private boolean expensive;

    // Validation di Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
