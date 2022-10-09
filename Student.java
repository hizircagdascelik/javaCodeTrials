

public class Student
{
    private String studentId ;  
    public String getStudentId(){
        return studentId;
    }
    
    public String setStudentId(String Id){
        this.studentId = Id;
    }
    
    private String studentName ;
    public String getStudentName(){
        return  studentName;
        
    }
    
    public String setStudentName(String name){
        this.studentName = name;
        
    }
    
    private String collegeName ;
    public String getCollegeName(){
        return  collegeName;
        
    }
    public String setCollegeName(String college){
        this.collegeName = college;
    }
    
    private String address ;
    public String getAdress(){
        return  address;
    }
    public String setAdress(String addr){
        this.address=addr;
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student ogrenci =new Student();
        ogrenci.setStudentId("id deneme");
        ogrenci.setStudentName("cagdas");
        ogrenci.setCollegeName("ankara");
        ogrenci.setAdress("deneme adresi");
        

        System.out.println("calisti!!"+" ogrenci ismi:"+ogrenci.getStudentName()+" kolej ismi:"+ogrenci.getCollegeName());
    }
}
}
