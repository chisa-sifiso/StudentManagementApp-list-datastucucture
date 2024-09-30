/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Sifiso
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       
       Scanner input = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int useropt=opt();
        while(true){
           if(useropt==1){
                Student stu = new Student();
               List<String> listsubs= new ArrayList<>();
               System.out.print("Enter the name of stu to add:");
               String name =input.nextLine();
               System.out.print("Enter the surname of stu to add:");
               String surname =input.nextLine();
               System.out.print("Enter the student num of stu to add:");
               String stuNum =input.nextLine();
               System.out.print("Enter a subject the student is doing to add:Press<<EEE>> when done:");
               String sub =input.nextLine();
               listsubs.add(sub);
               while(!sub.equals("EEE")){
                  System.out.print("Enter a subject the student is doing to add:Press<<EEE>> when done  :");
                   sub =input.nextLine();
                   if(!sub.equals("EEE")){
                   listsubs.add(sub);
                   }
               }
               stu.setName(name);
               stu.setSurname(surname);
               stu.setStudentNum(stuNum);
               stu.setSubjects(listsubs);
               list.add(stu);
               System.out.println(list);
               }
           if(useropt==2){
               for(Student i:list){
                   System.out.println(i.getName()+"  "+i.getStudentNum());
               }
           }
           if(useropt==3){
               System.out.print("Enter name of student to remove:");
               String name =input.nextLine();
               for (int i = 0; i < list.size(); i++) {
                        if(list.get(i).getName().equals(name)){
                            list.remove(i);
                        }  
               }
           }
           if(useropt==4){
               System.out.print("Enter student to search:");
               String name =input.nextLine();
               for (int i = 0; i < list.size(); i++) {
                   if(list.get(i).getName().equals(name)){
                       System.out.println("Student Found");
                   }else{
                       System.out.println("Student not found");
                   }
               }
           }
           if(useropt==6){
               JFileChooser fc = new JFileChooser(".");
               int val = fc.showOpenDialog(null);
               if(val==JFileChooser.APPROVE_OPTION){
                  File f=fc.getSelectedFile();
                  FileWriter fW= new FileWriter(f,true);
                  BufferedWriter bW = new BufferedWriter(fW);
                   for (int i = 0; i < list.size(); i++) {
                       bW.newLine();
                   String name = list.get(i).getName();
                   String surname = list.get(i).getSurname();
                   String stuNum = list.get(i).getStudentNum();
                  
                     bW.write(name+"  "+surname+"  "+stuNum);
                     
                   }
                  bW.close();
               }
               
           }
            useropt=opt();
        }
        
    }
     public static int opt(){
       System.out.println("==============Menu===========");
       System.out.println("1.Add a student");
       System.out.println("2.Details of all the students");
       System.out.println("3.Remove a student");
       System.out.println("4.Search for a student");
       System.out.println("5.Update the details of a student");
       System.out.println("6.Save text file");
       Scanner input = new Scanner(System.in);
         System.out.print("Enter OPTION:");
       return input.nextInt();
   }   
}
