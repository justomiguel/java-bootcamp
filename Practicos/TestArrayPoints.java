
public class TestArrayPoints {
	public static void main(String[] Args){
		
		MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
		for (int i = 0; i<=9;i++) {
		   points[i] = new MyPoint(i,i);     
		}
		for (int i = 0; i<=9;i++) {
			   System.out.println(points[i]);     
			}
		}
}
