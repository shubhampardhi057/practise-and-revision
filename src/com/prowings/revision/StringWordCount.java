package com.prowings.revision;

public class StringWordCount {
	
	public static void main(String[] args) {
		
		String s = "india is my country india is powerfull";
		
		String [] words = s.split(" ");
		
		int wordcount =0;
		
		for(int i=0;i<words.length;i++)
		{
			
			for(int j =0;j<words.length;j++)
			{
				
				if(words[i].equals(words[j]))
				{
					
					if(i == 4) 
					{
						continue;
					}
					wordcount++;
					
				}
			}
			System.out.println("@"+words[i]+ "  occured  : =  "+ wordcount);
			wordcount= 0;
		}
		
		
	}

}
