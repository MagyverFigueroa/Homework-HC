import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Floop_fill {

	static int visit[][];
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("C:/Users/User/Downloads/input.in"));
		PrintWriter out = new PrintWriter(new File(
				"C:/Users/User/Downloads/output.in"));
		int casos = Integer.parseInt(in.nextLine());
		for (int i = 0; i < casos; i++) {
			String datos[] = in.nextLine().split(" ");
			int a = Integer.parseInt(datos[0]);
			int b = Integer.parseInt(datos[1]);

			visit = new int[a][b];
			for (int j = 0; j < a; j++) {
				String cad = in.nextLine();
				for (int j2 = 0; j2 < b; j2++) {
					if (cad.charAt(j2) == '#')
						visit[j][j2] = 1;
				}
			}

			print(visit);
			for (int j = 0; j < a; j++) {
				for (int j2 = 0; j2 < b; j2++) {
					if (visit[j][j2] == 0) {
						visit[j][j2]=1;
						solve(a, b, j, j2, 0);
						
					}
				}
			}
		}
		in.close();
		out.close();
	}

	static int X[] = { 0, 1, -1, 0 };
	static int Y[] = { 1, 0, 0, -1 };

	public static void solve(int a, int b, int x, int y, int dist) {
		print(visit);
		for (int i = 0; i < X.length; i++) {
			int X1 = X[i] + x;
			int Y1 = Y[i] + y;
			if (X1 >= 0 && Y1 >= 0 && X1 < a && Y1 < b)
				if (visit[X1][Y1] == 0) {
					visit[X1][Y1] = 1;
					solve(a, b, X1, Y1, 0);
					
				}
		}

	}

	static class nodo {
		int x;
		int y;
		int dist;

		public nodo(int x, int y, int dist) {
			super();
			this.x = x;
			this.y = y;
			this.dist = dist;
		}

	}

	private static void print(Object... rs) {
		System.err.println(Arrays.deepToString(rs).replace("],", "]\n") + "\n");
	}
}
