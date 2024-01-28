package sony;

public class Recursiion {
	
	
		
		
		public static void getNum(int num)
		{
			if(num>20)
			{
				return ;
				
			}
			else
			{
				System.out.println(num);
				num=num+1;
				getNum(num);
				return ;
			}
		}
public static void main(String[] args) {
	Recursiion.getNum(01);
}


}


