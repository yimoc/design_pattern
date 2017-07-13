package pattern.structural.adapter.exam4.byclass;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String str) {
		super(str);
	}

	@Override
	public void pringWeak() {
		showWithParen();
		
	}

	@Override
	public void pringStrong() {
		showWithAster();
		
	}

}
