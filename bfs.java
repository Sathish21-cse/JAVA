import java.util.*;
public class bfs {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of vertices:");
    int n=sc.nextInt();
    List<List<Integer>> graph=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      graph.add(new ArrayList<>());
    }
    System.out.println("Enter no of edges:");
    int e=sc.nextInt();
    for(int i=0;i<e;i++)
    {
      int u=sc.nextInt();
      int v=sc.nextInt();

      graph.get(u).add(v);
      graph.get(v).add(u);
    }

    System.out.println("Enter statring node:");
    int s=sc.nextInt();

    bfs(s,graph);
  }
  public static void bfs(int s,List<List<Integer>> graph)
  {
    boolean[] vist=new boolean[graph.size()];
    Queue<Integer> q=new LinkedList<>();
    vist[s]=true;
    q.add(s);

    while(!q.isEmpty())
    {
      int node =q.poll();
      System.out.print(node+" ");

      for(int nig:graph.get(node))
      {
        if(!vist[nig]){
          vist[nig]=true;
          q.add(nig);
        }
      }
    }
  }
}
