package enum_ex;

public enum Fruit {
	
	APPLE("apple"),
	ORANGE("orange"),
	BANANA("banana"),
	GRAPE("grape");
	
	private String fru;
	protected String read;
	public String val = "default";
	private Fruit(String val){
		this.fru = val;
		read = fru;
	}
	
	

}
