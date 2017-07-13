package pattern.structural.adapter.exam4.byclass;

public class Banner {
	private String string;
	public Banner(String str){
		this.string = str;
	}
	
	public void showWithParen(){
		System.out.println("("+ this.string + ")");
	}
	
	public void showWithAster(){
		System.out.println("8"+ this.string + "*");
	}

}
