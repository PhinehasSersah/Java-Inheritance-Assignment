
class Rectangle{
	int lenght;
	int breadth;
	public Rectangle(int l, int b) {
		lenght = l;
		breadth = b;
}
	void Area() {
		System.out.println(lenght*breadth);
	}
	void Perimeter() {
		System.out.println(2*(lenght+breadth));
	}
}
class Square extends Rectangle{
	int side;
	public Square(int s){
		super (s,s);
	}
}
public class Q4 {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(10,5);
		r.Area();
		r.Perimeter();
		Square s = new Square (5);
		s.Area();
		s.Perimeter();
		
		Square[] a = new Square[10];
		    int c = 5;
		    for(int i = 0;i<10;i++){
		      a[i] = new Square(c);
		      c++;
		  }
  for(int i = 0;i<10;i++){
		      a[i].Area();
		      a[i].Perimeter();
		    }
		  }
		}

	
	





	


