import java.io.*;
class InputDemo{
        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter num : ");
                int num=Integer.parseInt(br.readLine());
		
		int temp=num;
                int rem=0;
		int sum=0;

                while(num>0){
                        rem=num%10;
                        sum=(sum*10)+rem;
                        num=num/10;
                }
                
		if(temp==sum){
			System.out.println(temp+ " is palindromr number");
		}else{
			System.out.println(temp+" is not a palindrome number");
		}
        }
}
