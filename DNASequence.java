import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DNASequence {

	public static void main(String[] args) throws IOException {
		
		String FilePath="C:/Users/mdhoot/Desktop/DNASequence.txt";
		FileReader f=new FileReader(FilePath);
		BufferedReader bf=new BufferedReader(f);
		String dna=bf.readLine();
		
		 int interimresult=0;
		    int result=0;             
		    char nucleotide=' ';
		    for(int i=0;i<dna.length();i++)
		    {
		        char ch=dna.charAt(i);
		        interimresult += 1;       
		        for(int j=i+1;j<dna.length();j++)
		        {
		            char ch1=dna.charAt(j);
		            if(ch!=ch1)
		            {
		                break;
		            }
		            interimresult +=1;
		        }
		        if(interimresult>result)
		        {
		        	result = interimresult;
		        	nucleotide=ch;
		        }
		        interimresult = 0;                   
		    }
		   System.out.println(nucleotide+" "+result);

		   bf.close();
	}

}
