
interface langauge
{
	public void get_name(String lang_name);
}


class programing_lang implements langauge
{
	public void get_name(String lang_name) 
	{
		System.out.println("Lang is java");
	}
}

class mains
{
	public static void main(String[] args)
	{
		programing_lang lang= new programing_lang();
		lang.get_name("java");
	}
}