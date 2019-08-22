package normalTest;

import java.io.Serializable;

/**
 * 序列化
 * @author Administrator
 */
public class Box implements Serializable{

    private int width;
    private int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public String toString() {
		return "child{weight="+width+",height="+height+"}";
	}
   
}