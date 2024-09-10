import java.util.Scanner;
public class grade_management{
    private static void printGrades(int grade[][]){
        for(int i=0;i<grade.length;i++){
            System.out.println("Student"+(i+1)+"Math:"+grade[i][0]+"Science:"+grade[i][1]);


        }
    }
    private static double calculateAverage(int grade[][],int subjectIndex){
        int sum=0;
        for(int i=0;i<grade.length;i++){
            sum=sum+grade[i][subjectIndex];

        }
        return (double)sum/grade.length;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        final int num_students=5;
        int grade[][]=new int[num_students][2];
        for(int i=0;i<num_students;i++){
            System.out.println("The grade of student "+(i+1));
            grade[i][0]=scanner.nextInt();
            grade[i][1]=scanner.nextInt();

        }
        printGrades(grade);
        double averageMath=calculateAverage(grade,0);
        double averageScience=calculateAverage(grade,1);
        System.out.println("Average of maths is"+ averageMath);
        System.out.println("Average of Science is"+averageScience);




    }
}