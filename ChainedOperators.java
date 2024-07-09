import java.util.function.IntBinaryOperator;
public class ChainedOperators {

	public static void main(String[] args) {
		
		IntBinaryOperator iBin = (x,y)->((5*(2*x+3*y))/2);
		
		for(int i =3; i<6;i++) {
			for(int a=5;a<9;a++) {
				System.out.printf("for the values x=%d and y=%d the result is %d\n", i,a,iBin.applyAsInt(i,a));
				
			}
		}

	}

}
