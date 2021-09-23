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
		String str = "";
		String s1 = " hate ";
		String s2 = " love ";
		
		for(int i=1;i<=N;i++){
		    if(i%2!=0)
		        str+="I"+s1;
		    else if(i%2==0)
		        str+="I"+s2;
		    
		    if(i==N)
		        str+="it";
		    else
		        str+="that ";
		}
		
		System.out.println(str);
		
		
	}
}
