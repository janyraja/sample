package MvcExample.FirstMvcProject.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MvcExample.FirstMvcProject.StudentEntity.Student;
import MvcExample.FirstMvcProject.StudentRepository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	public Student saveStudent(Student student)
	{
		Student saveStudent=studentRepository.save(student);
		return saveStudent;
		
	}
	
	public Student findByName(String name)
	{
		Student student=studentRepository.findByStudentName(name);
		return student;
	}
	
	public Optional<Student> findByNameId(String name,int id)
	{
		return studentRepository.findByStudentNameAndId(name, id);
	}
	
	public List<Student> findNameOrId(String name,int id)
	{
		return studentRepository.findByStudentNameOrId(name, id);
	}
	
	public List<Student> findIdBetween(int sId,int eId)
	{
		return studentRepository.findByIdBetween(sId,eId);
	}
}
