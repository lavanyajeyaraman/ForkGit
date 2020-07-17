
public class WordOccurence {
	
	public static void duplicate(String str)
	{
		String a[] = str.split(" ");
		for(int i=0;i<=a.length;i++)
			for(int j=i+1;j<a.length;j++)
		{
			if(a[i].equalsIgnoreCase(a[j]))
			{
				System.out.println("Duplicate word is:"+a[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		String str = "Learn Selenium Learn";
		duplicate(str);
		

	}

}
