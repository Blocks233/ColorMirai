package Color_yr.ColorMirai.Pack.ToPlugin;

/*
15 [机器人]登录完成, 好友列表, 群组列表初始化完成（事件）
id：机器人QQ号
 */
public class BotOnlineEventPack {
    private long id;

    public BotOnlineEventPack(long id) {
        this.id = id;
    }

    public BotOnlineEventPack() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
