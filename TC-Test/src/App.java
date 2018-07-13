
public class App {

	public static void main(String[] args)
	{
int x = 5;
int y = 7;

int value = 0;
while (x >= 0)
{
	value = Add(value,y);
x--;
}
x = value;
	}

public static int Add(int a, int b)
{
	return (a+b);
	}


}
