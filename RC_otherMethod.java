import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.Math.*;


public class RC_otherMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
	Scanner in = new Scanner(new File("C:/Users/User/Downloads/input.in"));
	PrintWriter out = new PrintWriter(new File("C:/Users/User/Downloads/output.in"));
	int casos = Integer.parseInt(in.nextLine());
	for (int i = 0; i < casos; i++) {
		String cad2[]=in.nextLine().split(" ");
		int a=Integer.parseInt(cad2[0]);
		int b=Integer.parseInt(cad2[1]);
		
		int x=-1, y=-1, X1=-1,Y1=-1;
		
		for (int j = 0; j < a; j++) {
			String cad=in.nextLine();
			for (int j2 = 0; j2 < b; j2++) {
				if(cad.charAt(j2)=='R'){
					x=j;
					y=j2;
				}
				if(cad.charAt(j2)=='C'){
					X1=j;
					Y1=j2;
				}
			}
		}
		//System.out.println(x+" "+y+" "+X1+" "+Y1);
		int cont=abs(X1-x)+abs(Y1-y);
		System.out.println(cont);
	}
	in.close();
	out.close();
}

}
