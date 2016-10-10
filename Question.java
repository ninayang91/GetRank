
public class Question {
	private static RankNode root=null;
	
	public static void track(int number){
		if(root==null){
			root=new RankNode(number);
		}else{
			root.insert(number);
		}
	}
	
	public static int getRankOfNumber(int number){
		return root.getRank(number);
	}

}
