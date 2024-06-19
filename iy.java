class Student{
    int studId =101;
    String studName = "sara";
    double studmark = 85.5;

}
class Standard extends  Student{
   int  StudStd =10;
   char StudSec='A';
   String StudTeachName= "Mala";
}
public class inhertiance {
    public static void main(String[] args) {
        Standard stdobj = new Standard();
        System.out.println(stdobj.studId);
        System.out.println(stdobj.studName);
        System.out.println(stdobj.studmark);