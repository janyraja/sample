package MvcExample.FirstMvcProject.StudentController1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import MvcExample.FirstMvcProject.StudentEntity.Student;
import MvcExample.FirstMvcProject.StudentService.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
@Autowired
private StudentService studentService;

@PostMapping("/savestudent")
public Student saveStudent(@RequestBody Student student)
{
	return studentService.saveStudent(student);
}

@GetMapping("getStudentbyname")
public Student studentFindByNameandId(@RequestParam("studentName") String name)
{
	Student getStudentfield =studentService.findByName(name);
	return getStudentfield;
}

@PostMapping("getNameId")
public Optional<Student> fingByNameId(@RequestParam("studentName")String name,@RequestParam("id") int id)
{
	return studentService.findByNameId(name, id);
}

@GetMapping("/getnameorid")
public List<Student> findNameOrId(@RequestParam("studentName") String name,@RequestParam("id")int id)
{
	return studentService.findNameOrId(name, id);
}

@GetMapping("/getidBetween")
public List<Student> findIdBetwen(@RequestParam("startid") int sid,@RequestParam("endid")int eid)
{
	return studentService.findIdBetween(sid, eid);
}

}
