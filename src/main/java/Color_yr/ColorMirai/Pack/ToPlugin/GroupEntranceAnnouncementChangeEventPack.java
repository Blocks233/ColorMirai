package Color_yr.ColorMirai.Pack.ToPlugin;

/*
27 [机器人]入群公告改变（事件）
id：群号
fid：执行人QQ号
old：旧的状态
new_：新的状态
 */
public class GroupEntranceAnnouncementChangeEventPack {
    private long id;
    private long fid;
    private String old;
    private String new_;

    public GroupEntranceAnnouncementChangeEventPack(long id, long fid, String old, String new_) {
        this.id = id;
        this.old = old;
        this.new_ = new_;
        this.fid = fid;
    }

    public GroupEntranceAnnouncementChangeEventPack() {
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

    public String getNew_() {
        return new_;
    }

    public void setNew_(String new_) {
        this.new_ = new_;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }
}
