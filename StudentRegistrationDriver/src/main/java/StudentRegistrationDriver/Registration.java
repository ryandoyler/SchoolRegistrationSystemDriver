/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistrationDriver;

import StudentRegistration.Module;
import StudentRegistration.Program;
import StudentRegistration.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;


/**
 *
 * @author User
 */
public class Registration {
    
    public static void main(String [ ] args)
{
    
      Date date = new Date();
      Student ryan = new Student("Ryan", 21, date, 13354296 );
      Student ben = new Student("Ben", 23, date, 13284923);
      Student samantha = new Student("Samantha", 23, date, 13282954);
      Student rose = new Student("Rose", 22, date, 13289204);
      Student owen = new Student("Owen", 20, date, 13282734);
      Student tracey = new Student("Tracey" , 24, date, 12478934);
      DateTime startDate = new DateTime(2016,9,1,0,0,0);
      DateTime endDate = new DateTime(2017,6,1,0,0,0);
      
      
      
             
   
   
      
      ArrayList<Student>machineLearningStudents = new ArrayList<Student>();
      machineLearningStudents.add(ryan);
      machineLearningStudents.add(ben);
      machineLearningStudents.add(tracey);
      
      ArrayList<Student> professionalSkillsStudents = new ArrayList<Student>();
      professionalSkillsStudents.add(ryan);
      professionalSkillsStudents.add(ben);
      professionalSkillsStudents.add(tracey);
      professionalSkillsStudents.add(samantha);
      professionalSkillsStudents.add(owen);
      professionalSkillsStudents.add(rose);
      
      ArrayList<Student> englishStudents = new ArrayList<>();
      englishStudents.add(samantha);
      englishStudents.add(owen);
      englishStudents.add(rose);
       
      
      Module machineLearning = new Module("Machine Learning", "ML436", machineLearningStudents);
      Module english = new Module("English", "ENG789", englishStudents);
      Module professionalSkills = new Module("Professional Skills", "PS478", professionalSkillsStudents);
      
      ArrayList<Module> computerScienceModuls = new ArrayList<>();
      computerScienceModuls.add(machineLearning);
      computerScienceModuls.add(professionalSkills);
      
      ArrayList<Module> englishStudiesModuls = new ArrayList<>();
      englishStudiesModuls.add(english);
      englishStudiesModuls.add(professionalSkills);

      
      
      Program computerScience = new Program("ComputerScience",computerScienceModuls , startDate, endDate);
      Program englishStudies = new Program("EnglishStudies",englishStudiesModuls , startDate, endDate);
      
      ryan.setCourse(computerScience);
      ben.setCourse(computerScience);
      tracey.setCourse(computerScience);
      
      samantha.setCourse(englishStudies);
      owen.setCourse(englishStudies);
      rose.setCourse(englishStudies);
      
      
      
      
      
      
      
       for (Student pStudent : professionalSkillsStudents)
       {
           ArrayList<Module> modules = new ArrayList<Module>();
           modules.add(professionalSkills);
           for (Student mStudent : machineLearningStudents)
           {
               if (pStudent.getName().equals(mStudent.getName()))
               {
                   modules.add(machineLearning);
               }
           }
           
           for (Student eStudent : englishStudents)
           {
               if (pStudent.getName().equals(eStudent.getName()))
               {
                   modules.add(english);
               }
           }
           
           
           
           String studentModules = "";
           for (Module module : modules)
           {
              
                studentModules = studentModules + module.getModuleName() +", ";
              
           }
           Program course = pStudent.getCourse();
           System.out.println(pStudent.getName() + " is in the course " + course.getCourseName() + " taking modules " + studentModules);
           
           
       
       }

      
      
}
    
}
