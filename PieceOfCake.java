import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PieceOfCake {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String FilePath="C:/Users/mdhoot/Desktop/PieceOfCake.txt";
		FileReader f=new FileReader(FilePath);
		BufferedReader bf=new BufferedReader(f);
		int count=Integer.parseInt(bf.readLine());
		long area[]=new long[count];
		for(int i=0; i<count;i++)
			area[i]=Long.parseLong(bf.readLine());
		List<Long> factors = new ArrayList<Long>();
		long outputarr[]=new long[count];
		long factor1=0, factor2=0;
		for(int i=0;i<count;i++)
		{
			long pick=area[i];
			if(pick==1)
			{
				outputarr[i]=4;
				continue;
			}
			for (long j=2; j<pick/3;j++)
			{
				if(pick%j==0)
					factors.add(j);
			}
			if(factors.size()==1)
			{
				outputarr[i]=4*factors.get(0);
				continue;
			}
			for(int k=0; k<factors.size()-1;k++)
			{
				if(factors.get(k)*factors.get(k+1)==pick)
					{
					factor1=factors.get(k);
					factor2=factors.get(k+1);
					break;
					}
			}
			
			outputarr[i]= 2*(factor1+factor2);
			factors.removeAll(factors);
		}
		
		for(int i=0; i<count;i++)
			System.out.println(outputarr[i]);
	}

}
