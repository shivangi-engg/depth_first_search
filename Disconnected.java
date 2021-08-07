//depth first traversal of a disconnected graph using the adjacency list 
import java.util.*;
import java.lang.*;
public class Disconnected
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("no of nodes:");
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
		for(int i=0; i< n; i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		System.out.println("adjacency list inputs:");
		for(int i=0;i<n;i++)
		{
			System.out.println("no of adjacents of "+i+": ");
			int m = sc.nextInt();
			System.out.println("enter adjacents of "+i+": ");
			for(int j=0; j<m; j++)
			{
				int val = sc.nextInt();
				adj.get(i).add(j,val);
			}
		}

		//depth first traversal
		System.out.print("depth first traversal:");
		boolean []visited = new boolean[n];
		for(int i=0;i<n;i++)
		{
			if(visited[i] == false)
				dfsLogic(adj,visited,i,n);
		}
	}

	public static void dfsLogic(ArrayList<ArrayList<Integer>> adj, boolean []visited, int s, int n)
	{
		visited[s] = true;
		System.out.print(s+" ");
		for(int u:adj.get(s))
			if(visited[u] == false)
				dfsLogic(adj,visited,u,n);
	}
}