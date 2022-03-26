package Gaurav;
import java.util.regex.*;
class CharacterExample
{
public static void main(String []args)
{
Pattern p = Pattern.compile("[kvdkjkldkfnfdksjknvkds;jgdgsj;giorgespejogjs;gjdjdkgj;dkfgjdvndfk]");
Matcher m =p.matcher("sadfhewioumsdfk;lsduoieuujfjkh8ewoijikhgkfhdkshkdhsfjfhahfduhfsufjkjUfksfjsfkslRafikhfosikAfjksfhsikfjkAskdfhksjfVfhiufjeiokeleEIoifjoiekehiukljfkjkfjkjfjeikJLKDSKFJUERFKCNK;AJ;AJWEOLJA;SKJK,S.ZM,KFWEO;ALKDJOIEWKJWOIKJKASJOIAWKJOIKSDKLSSK");
while(m.find())
{
System.out.println(m.start()+" "+m.end()+" "+m.group());
}
}
}