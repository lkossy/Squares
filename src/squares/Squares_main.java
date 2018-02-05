package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 0.0, 0.2, 0.3, 0.5, 1.0, 1.1, 1.4 };
		double y[] = { 1.1, 1.8, 2.0, 2.9, 4.8, 5.7, 6.0 };
		double theta[] = new double[2];

		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getObject());
		}


	}

}