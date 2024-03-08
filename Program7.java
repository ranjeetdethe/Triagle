import java.io.*;
class InputDemo{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter num : ");
		int num=Integer.parseInt(br.readLine());
		
		int rem=0;
		
		while(num>0){
			rem=num%10;
			System.out.print(rem );

			num=num/10;
		}
		System.out.println();
	}
}
