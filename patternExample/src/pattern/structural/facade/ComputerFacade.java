package pattern.structural.facade;

public class ComputerFacade {
	private CPU processor;
	private HardDrive hd;
	private Memory ram;
	
	public ComputerFacade(){
		this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();

	}
	
	public void start(){
		processor.freeze();
        ram.load(1001, hd.read(2000, 1024));
        processor.jump(2048);
        processor.execute();


	}
}
