
public class TestMyPoint {
public static void main(String[] Args){
		
	MyPoint p1 = new MyPoint(3, 0);
	MyPoint p2 = new MyPoint(0, 4);
	System.out.println(p1.distance(p2));
	System.out.println(p1.distance(5, 6));
	}
}
