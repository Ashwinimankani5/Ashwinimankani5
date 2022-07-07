public class NovelDTO
{
	
	public Novel()
	{
	}

	private String name;
	private String authorName;
	private int idno;
	private double price;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	public int getIdno()
	{
		return idno;
	}
	public void setIdno(int idno)
	{
		this.idno = idno;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	
	public void imagine()
	{
		System.out.println("about nature....");
	}
	
}