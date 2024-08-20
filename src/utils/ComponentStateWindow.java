package utils;

import java.awt.Rectangle;
import java.io.Serializable;

public class ComponentStateWindow implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Rectangle bounds;
    private String bodyNote;
    private String titleNote;
    private String name;

    public ComponentStateWindow(Rectangle bounds, String bodyNote, String titleNote, String name) {
        this.bounds = bounds;
        this.bodyNote = bodyNote;
        this.titleNote = titleNote;
        this.name = name;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    public String getBodyNote() {
        return bodyNote;
    }

    public void setBodyNote(String bodyNote) {
        this.bodyNote = bodyNote;
    }

    public String getTitleNote() {
        return titleNote;
    }

    public void setTitleNote(String titleNote) {
        this.titleNote = titleNote;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
