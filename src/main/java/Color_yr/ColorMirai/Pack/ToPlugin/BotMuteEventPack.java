package Color_yr.ColorMirai.Pack.ToPlugin;

/*
9 [机器人]被禁言（事件）
id：群号
name：执行人nick
fid：执行人QQ号
time：禁言时间
 */
public class BotMuteEventPack {
    private long id;
    private String name;
    private long fid;
    private int time;

    public BotMuteEventPack(String name, long id, long fid, int time) {
        this.fid = fid;
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public BotMuteEventPack() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
