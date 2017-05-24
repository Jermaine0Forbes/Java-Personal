package enum_ex;

public enum Countries {
	
	JPN("Japan"),
	USA("America"),
	CHN("China"),
	UK("United Kingdom"),
	NIG("Nigeria");
	
	private String cou;
	
	private Countries(String cou){
		this.cou = cou;
	}
	
	public String getVal(){
		return this.cou;
	}
}
