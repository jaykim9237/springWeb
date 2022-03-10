package global.sesoc.school.dao;

import java.util.ArrayList;

import global.sesoc.school.vo.StudentVO;

//학생정보 처리
public interface StudentMapper {

	int enrollStudent(StudentVO studentvo);

	ArrayList<StudentVO> listStudent();

	int deleteStudent(String stclass, String stnum);

	int editStudent(String stclass, String stnum);

}