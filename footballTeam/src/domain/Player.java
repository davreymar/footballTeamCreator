package domain;

public class Player {
	
	public Player(){
		
	}
	
	private String name;
	private PositionEnum positionPref;
	private Characteristic characteristic;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PositionEnum getPositionPref() {
		return positionPref;
	}
	public void setPositionPref(PositionEnum positionPref) {
		this.positionPref = positionPref;
	}
	public Characteristic getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(Characteristic characteristic) {
		this.characteristic = characteristic;
	}
	
	
	
}
