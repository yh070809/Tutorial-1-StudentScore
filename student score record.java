
class Student {
    private String name;
    private int chinese;
    private int math;
    private float avg; 
  
    public Student (String name){
        this.name = name;
    }
  
    public String getname (){
        return name ;
    }

    public void setname (String name){
        this.name = name ;
    }
    
    public int getchinese(){
        return chinese;
    } 
   
    public void setchinese(int chinese){
        this.chinese = chinese;
    }
  
    public int getmath(){
        return math;
    }
  
    public void setmath(int math){
        this.math = math;
    }
  
    public float getavg(){
        return avg;
    }
  
    public void setavg(){
        this.avg = (float)(this.chinese + this.math)/2;
    }
}