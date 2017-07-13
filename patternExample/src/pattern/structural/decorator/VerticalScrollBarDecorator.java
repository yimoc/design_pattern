package pattern.structural.decorator;

public class VerticalScrollBarDecorator extends WindowDecorator {

	public VerticalScrollBarDecorator(Window windowToBeDecorated) {
		super(windowToBeDecorated);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void draw() {
        super.draw();
        drawVerticalScrollBar();
    }

    private void drawVerticalScrollBar() {
        // Draw the vertical scrollbar
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including vertical scrollbars";
    }


}
