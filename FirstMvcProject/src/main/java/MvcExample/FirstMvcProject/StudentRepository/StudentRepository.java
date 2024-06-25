package MvcExample.FirstMvcProject.StudentRepository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import MvcExample.FirstMvcProject.StudentEntity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

	Student findByStudentName(String name);
	Optional<Student> findByStudentNameAndId(String name,int id);
	List<Student>findByStudentNameOrId(String name,int id);
	List<Student>findByIdBetween(int sid,int eid);
	
}
