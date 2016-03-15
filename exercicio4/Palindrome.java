//Lavinia Maria Vitor 
public class Palindrome{
    public static void main(String[]args){
        boolean  bool=false;
        String text = args[0],t="";
        int nletras = 5;
        int letras = text.length();
        int nvezes = letras - nletras;

//Lavinia Maria Vitor


        for(int i=0;i<=nvezes;i++){
            t = text.substring(i,i+nletras);

            StringBuffer txtrever = new StringBuffer(t);
            txtrever.reverse();
			      String rever = txtrever.toString();
            if(t.equals(rever)){
                System.out.println("Palindrome: " + t);
				System.out.println("Posição: " + (i + 1) + "-" + (i+nletras));
                bool=true;
            }
        }
        if(bool==false){
            System.out.println("Não foi encontrada palindromes com 5 letras");
        }
    }
}
//Lavinia Maria Vitor
