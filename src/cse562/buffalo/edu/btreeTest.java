package cse562.buffalo.edu;

public class btreeTest {
	private static void test(Node node){
		if(!node.isleaf){
			for(Node son: node.sons){
				test(son);
				
				
			}
		}
		
		else{
			for(Integer i: node.keys){
				System.out.print(i);
			}
			System.out.println("'");
		}
			
	}
		

	
	
	public static void main(String[] args){
		Btree btree = new Btree(4);
		int n = 50;
		int[] range = new int[2];
		range[0] = 0;
		range[1] = n;
		btree.index(range, btree.root);
		test(btree.root);
		System.out.println(btree.root.keysize());
		
		
		
	}
}
