public class IplDTO
{
	//rule1:use public in class and also use DTO at the end of the suffix
	//[DTO : data transfer object]
	//rule 2: having defalut or parameterised constructor
	public Ipl()
	{
	}
//rule 3:make all properties or members private
	private String teamName;
	private String tourney;
	private String price;
	
	//rule 4: use getter and setter method
	public String getTeamName()
	{
		return teamName;
	}
	public void setTeamName(String teamName){
		this.teamName = teamName;
	}
	public String getTourney()
	{
		return tourney;
	}
	public void setTourney(String tourney){
		this.tourney = tourney;
	}
	public String getPrice()
	{
		return price;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	
	
	public void worldCup()
	{
		System.out.println("E sala cup namde....");
	}
	
}