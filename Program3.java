import java.io.*;
class InputDemo{
        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter num ");
                int num=Integer.parseInt(br.readLine());

                int count=0;
                int i=1;
                while(i<=num){
                        if(num%i==0){
                                count++;
                        }
                        i++;
                }
                if(count>2){
                        System.out.println(num +" is a composite number");
                }else{
			System.out.println(num +" is not a composite prime number");
		}
        }
}
