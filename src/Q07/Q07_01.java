package Q07;

public class Q07_01 {
static{
	System.out.println("此區為靜態變數(Static Variable)A");
	};

public Q07_01(){
	System.out.println("此區為Q07_01建構子(Q07_01 Continue)");

};
static{
	System.out.println("此區為靜態變數(Static Variable)B");
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q07_01 con = new Q07_01();
		System.out.println("hahahaha");
	}
static{
	System.out.println("此區為靜態變數(Static Variable)C");
	};

}
