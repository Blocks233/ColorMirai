package Color_yr.ColorMirai.Pack.ToPlugin;

public class BeforeImageUploadPack {
    private String name;
    private long id;

    public BeforeImageUploadPack() {
    }

    public BeforeImageUploadPack(String name, long id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}