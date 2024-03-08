import java.io.*;
class InputDemo{
        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter num ");
                int num=Integer.parseInt(br.readLine());

                int i=1;
		while(i<=num){
			if(num%i==0){
				System.out.print(i +" ");
			}
			i++;
		}
        }
}
