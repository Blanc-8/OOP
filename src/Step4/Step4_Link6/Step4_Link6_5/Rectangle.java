package Step4.Step4_Link6.Step4_Link6_5;

public class Rectangle implements Resizable{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int newWidth) {
        this.width = newWidth;
    }

    @Override
    public void resizeHeight(int newHeight) {
        this.height = newHeight;
    }

    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
