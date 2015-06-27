package behavioral.interpreter;

public class ConversionContext {

	private String conversionQues="";
	private String conversionResponse="";
	private String fromConversion="";
	private String toConversion="";
	private Double quantity;
	String[] partsOfQuestion;
	
	
	public ConversionContext(String input){
		conversionQues = input;
		partsOfQuestion = getInput().split(" ");
		//1 gallons to pints
		fromConversion = getCapitalized(partsOfQuestion[1]);
		toConversion = getLowerCase(partsOfQuestion[3]);
		quantity = Double.valueOf(partsOfQuestion[0]);
		conversionResponse = partsOfQuestion[0]+ " " + partsOfQuestion[1] + " equals ";
	}
	
	

	public String getInput(){
		return conversionQues;
	}
	
	public String getFromConversion(){
		return fromConversion;
	}

	public String getToConversion(){
		return toConversion;
	}
	
	public String getResponse(){
		return conversionResponse;
	}
	
	public Double getQuantity(){
		return quantity;
	}
	
	public String getCapitalized(String word){
		word = word.toLowerCase();
		word = Character.toUpperCase(word.charAt(0))+word.substring(1);
		int lengthOfWord = word.length();
		if(word.charAt(lengthOfWord-1)!='s')
			word=word+"s";
		
		return word;
	}
	
	private String getLowerCase(String word) {
		return word.toLowerCase();
	}
}
