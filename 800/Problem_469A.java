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
		int count =0;
		
		int arr[] = new int[N+1];
		for(int i=0;i<=N;i++){
		    arr[i] = 0;
		}
		
		int p = sc.nextInt();
		for(int i=1;i<=p;i++){
		    int x=sc.nextInt();
		    if(arr[x] == 0){
		        arr[x] = 1;
		    }
		    
		}
		int q = sc.nextInt();
		for(int i=1;i<=q;i++){
		    int z = sc.nextInt();
		    if(arr[z] == 0){
		        arr[z] = 1;
		    }
		}
		
		for(int i=1;i<=N;i++){
		    if(arr[i] == 1)
		        count+=1;
		}
		
		if(count == N)
		    System.out.println("I become the guy.");
		else
		    System.out.println("Oh, my keyboard!");
		
	}
}
