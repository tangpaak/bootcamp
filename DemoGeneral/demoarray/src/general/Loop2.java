package general;
public class Loop2 {
  public static void main (String[] args){
//break
for (int i = 0; i <6; i++){
  for (int j = 0; j <3; j++){
    System.out.println("i="+i+"j="+j);
    if (i == j){
      break;//this break statement just break the inner loop
    }
  }

}
//i = 0, j = 0, yes
//i = 0, j = 1, no
//i = 0, j = 2, no
//i = 1, j = 0, yes
//i = 1, j = 1, yes, break
//i = 1, j = 2, no
//i = 2, j = 0, yes
//i = 2, j = 1, yes
//i = 2, j = 2, yes, break
//i = 3, j = 0, yes
//i = 3, j = 1, yes
//i = 3, j = 2, yes
//i = 3, j = 3, no, break
//i = 4, j = 0, yes
//i = 4, j = 1, yes
//i = 4, j = 2, yes
//i = 4, j = 3, will not run
//i = 5, j = 0, yes
//i = 5, j = 1, yes
//i = 5, j = 2, yes
//i = 5, j = 3, will not run

//continue
for (int i = 0; i <6; i++){
  for (int j = 0; j <3; j++){
    if (i == j){
      continue; // skip the rest in inner loop, go to next iteration, 
    }

    System.out.println("i="+i + "j="+j);
  }
}
// i = 0, j = 0 , continue
// i = 0, j = 1, yes
// i = 0, j = 2, yes
// i = 1, j = 0, yes
// i = 1, j = 1, continue
// i = 1, j = 2, yes
// i = 2, ...

String str = "I love programming. I love Java.";
System.out.println("str length="+str.length());//32 ***important phase***

for(int i = 0; i <str.length();i++){// i<32(0-31)
  System.out.println("hello");
// 回圈通常係長度，或計數量
}
//print the index of the character,
//the first time of the character 'e'
//str.charAt(int index)


char b = str.charAt(5);
for(int i = 0; i <str.length();++i){
  if(str.charAt(i)== 'e'){
 System.out.println(i);
break;

}}
//check if y exist
//found or not found
for ( int i = 0 ; i< str.length();++i){
  if(str.charAt(i) =='y'){
    System.out.println("found");
    break;
  } else {System.out.println("not found");   
  break;}}

//
boolean found = false;
for (int i = 0 ; i < str.length();++i){
if (str.charAt(i) == 'y'){
  found = true;
  break;
}
}if (found==true){
  System.out.println("Found");
}else {
  System.out.println("Not Found");
}
//if the num of occurence of target >=3, print yes , otherwise print no
char target = 'o'; 
int count = 0;
for (int i = 0; i <str.length();++i){
  if(str.charAt(i) == target){
    count++;

  }
if (count >= 3){
  System.out.println("yes");
  break;
}
else{
  System.out.println("no");
  break;
}


}




}

}

  
