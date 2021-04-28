/**
 * This program takes in an integer representing the number of people in a town, and a 
 * 2 dimensional array showing their relationships with the intention of discovering if the town 
 * judge is present or not.
 * 
 * @author Simir Cooper 
 * @since 4/28/21
 */
public class Judge {
	public int findJudge (int N, int [][] trust) {
		if(N>1000 || trust.length >10000) {
			throw new UnsupportedOperationException("Too many entries!");
		}
		int trusts [] = new int [N+1]; //array for an individual that trusts another individual
		int trusted [] = new int [N+1]; //array for an individual that is trusted 
		for(int i =0; i< trust.length; i++) {
			trusts[trust[i][0]]++;
			trusted[trust[i][1]]++;
		}
		for(int w=0; w<=N; w++) {
			if(trusts[w]==0 && trusted[w]==N-1) {
				return w;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//Testing findJudge function
		Judge ob = new Judge();
		int [][] array = {{1,2}};
		int [][] array1 = {{1,3},{2,3}};
		System.out.println(ob.findJudge(2, array));
		System.out.println(ob.findJudge(3, array1));
	
	}
		
