package Main.Loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import Main.Model.Student;
import Main.Repository.StudentInterface;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	StudentInterface studentrepo;
	
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
	      	Student student_1 = new Student();
	        student_1.setName("Paul");
	        studentrepo.save(student_1);
	        
	        Student student_2 = new Student();
	        student_2.setName("Yeni");
	        studentrepo.save(student_2);
	        
	        Student student_3 = new Student();
	        student_3.setName("Chris");
	        studentrepo.save(student_3);
	         
	    }

}
