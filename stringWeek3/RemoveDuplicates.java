package stringWeek3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";		
		int count=0;
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			count=0;
			for (int j = 0; j < split.length; j++)
			{
				if (split[i].equals(split[j]))
				{
					count=count+1;
				}
			}
			
			if(count>1)
			{
				text=text.replace(split[i], "");
			
			}
			
		}
		System.out.println(text);
	}

}

