package pattern.structural.adapter.exam4.delegate;

import pattern.structural.adapter.exam4.byclass.Banner;

public class PrintBanner extends Print {
	Banner banner;
	public PrintBanner(String str){
		banner = new Banner(str);
	}
	
	@Override
	public void printWeak() {
		banner.showWithParen();

	}

	@Override
	public void printString() {
		banner.showWithAster();

	}

}
