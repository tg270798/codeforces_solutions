// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args)
	{
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		int avg = 0;
		double ans = 0.0;
	    int arr[] = new int[N];
	    for(int i=0;i<N;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i=0;i<N;i++){
	        avg+= arr[i];
	    }
	    
	    
	    int total = N*100;
	    ans = (double)avg/total;
	    
	    
	    
	    System.out.println(ans*100);
		
		
	}
}
