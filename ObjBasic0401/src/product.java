
public class product 
{
	String name;
	int price;
	
	int up(int amt)
	{
		return price += amt;
	}
	
	int down(int amt)
	{
		return price -= amt;
	}
	
	void display()
	{
		System.out.println(name + "：" + price + "円");
	}
}
