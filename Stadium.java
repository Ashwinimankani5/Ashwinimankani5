public class StadiumDTO
{
	
	public Stadium()
	{
		
	}
	//to achive encapsulation//
	
	private String name;
	private String address;
	private long contactno;
	
	//getter and setter
	
	public String getName()
	{
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public long getContactno()
	{
		return contactno;
	}
	public void setContactno(long contactno)
	{
		this.contactno = contactno;
	}
	
	
	public void playCricket()
	{
		System.out.println("to play cricket....");
	}
	
}