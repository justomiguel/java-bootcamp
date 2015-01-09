package ejercicio1house;

/**
 *
 * @author Santiago
 */
public class House {
    private double width;
    private double length;
    private int stories;
    private int rooms;

    @Override
    public String toString() {
        return "House{" + "width=" + width + ", length=" + length + ", stories=" + stories + ", rooms=" + rooms + '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    
    
}
