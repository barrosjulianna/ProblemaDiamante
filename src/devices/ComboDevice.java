package devices;
//heran�a multipla
public class ComboDevice extends Scanner,Printer {
// nao pode pois nao existe sintaxe pra isso, teria q fazer 2 interfaces
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
}
