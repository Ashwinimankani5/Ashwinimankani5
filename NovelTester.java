class NovelTester
{
	
	public static void main(String args[])
	{
		
	
	Novel nov = new Novel();
	
	nov.setName("kadambari");
	nov.setAuthorName("Krishna");
	nov.setIdno(4251);
	nov.setPrice(99);
	nov.imagine();
	
	System.out.println(nov.getName() + "  " +nov.getAuthorName() + "    " +nov.getIdno() + "   " +nov.getPrice());
	
	
		
	}





}