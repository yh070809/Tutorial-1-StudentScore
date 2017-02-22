import java.io.*

public class TestStudent{

   public static void main (String [] args) {

    Student st1 = new Student("XIAOGANG");
    Student st2 = new Student("XIAOHONG");
    Student st3 = new Student("XIAOMING"); 
    
    int final NUMBER_OF_STUDENT = 3, NUMBER_OF_SUBJECT= 2; 

    int chinesescore = new int [NUMBER_OF_STUDENT];
    try {
        BufferedReader br = new Buffereader (new inputStreamReader(System.in));
        for (int i = 0; i < NUMBER_OF_STUDENT; i++){
            System.out.print ("Please enter CHINESE score for sutents ...#"+(i+1)+":");
            String s1 = br.readLine(); 
            chinesescore[i] = Integer.parseInt(s1);
        }     
    } catch (Exception e){
            e.printStackTrace();
    }
    
    int total1 = 0;
    for (int i = 0; i < NUMBER_OF_STUDENT; i++){
        total1 += chinesescore[i];
    }
    System.out.println("Average score of Chinese :" + (float) total1 / NUMBER_OF_STUDENT);


    int mathscore = new int [NUMBER_OF_STUDENT];
    try {
        BufferedReader br = new Buffereader (new inputStreamReader(System.in));
        for (int i = 0; i < NUMBER_OF_STUDENT; i++){
            System.out.print ("Please enter MATH score for sutents ...#"+(i+1)+":");
            String s2 = br.readLine(); 
            mathscore[i] = Integer.parseInt(s2);
        }     
    } catch (Exception e){
            e.printStackTrace();
    }
    
    int total2 = 0;
    for (int i = 0; i < NUMBER_OF_STUDENT; i++){
        total2 + = mathscore[i];
    }
    System.out.println("Average score of Math :" + (float) total2 / NUMBER_OF_STUDENT);

    
    System.out.println(st1.getname()+"\t"+ st1.getchinese() + "\t" + st1.getmath()+ "\t" + st1.getavg());
    System.out.println(st2.getname()+"\t"+ st2.getchinese() + "\t" + st2.getmath()+ "\t" + st2.getavg());
    System.out.println(st3.getname()+"\t"+ st3.getchinese() + "\t" + st3.getmath()+ "\t" + st3.getavg());         
     
}