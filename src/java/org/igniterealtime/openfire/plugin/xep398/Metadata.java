package org.igniterealtime.openfire.plugin.xep398;

public class Metadata {
    private String id       = null;  //ID = SHA1-HASH of field image
    private int height      = -1;
    private int width       = -1;
    private String type = null;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String mimetype)
    {
        this.type = mimetype;
    }

    @Override
    public String toString() {
        return "    {\"id\":\""+id+"\","
                + "\"height\":\""+String.valueOf(height)+"\","
                + "\"width\":\""+String.valueOf(width)+"\","
                + "\"type\":\""+type+"\"}";
    }
}
