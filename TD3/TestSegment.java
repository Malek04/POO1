
public class TestSegment {
	public static void main(String[] args) {
		Segment s1 = new Segment(Integer.valueOf(args[0]).intValue(),Integer.valueOf(args[1]).intValue());
		System.out.println(s1.toString());
	}
}
