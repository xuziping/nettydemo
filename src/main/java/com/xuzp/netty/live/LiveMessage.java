package com.xuzp.netty.live;

/**
 * @author za-xuzhiping
 * @Date 2018/6/12
 * @Time 19:44
 */
public class LiveMessage {

    static final byte TYPE_HEART = 1;
    static final byte TYPE_MESSAGE = 2;

    private byte type;

    private int length;

    private String content;

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "LiveMessage{" +
                "type=" + type +
                ", length=" + length +
                '}';
    }
}
