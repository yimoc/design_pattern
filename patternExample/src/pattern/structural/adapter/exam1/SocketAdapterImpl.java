package pattern.structural.adapter.exam1;

public class SocketAdapterImpl extends Socket implements SocketAdpater {

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = getVolt();
		return convertVolt(v, 40);
	}
	
	public Volt convertVolt(Volt v, int i){
		return new Volt(v.getVolts());
	}

}
