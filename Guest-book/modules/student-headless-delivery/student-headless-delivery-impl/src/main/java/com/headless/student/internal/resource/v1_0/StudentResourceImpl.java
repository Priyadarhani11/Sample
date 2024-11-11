package com.headless.student.internal.resource.v1_0;

import com.headless.student.dto.v1_0.Student;
import com.headless.student.resource.v1_0.StudentResource;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.List;

import javax.validation.Valid;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author Dell
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/student.properties",
	scope = ServiceScope.PROTOTYPE, service = StudentResource.class
)
public class StudentResourceImpl extends BaseStudentResourceImpl {
	
	@Override
	public Student getStudent() throws Exception {
		
		List<Student> studentEntity = studentLocalServiceUtil.getStudents(-1, -1);
		JSONObject studentObject = JSONFactoryUtil.createJSONObject();
		JSONArray dataObject = JSONFactoryUtil.createJSONArray();
		
		for(Student entry : studentEntity) {
			JSONObject studentSingleObject = JSONFactoryUtil.createJSONObject();
			studentSingleObject.put("id", entry.getId());
			studentSingleObject.put("name", entry.getName());
			studentSingleObject.put("standard", entry.getStandard());
			dataObject.put(studentSingleObject);
		}
		studentObject.put("data", dataObject);
		studentObject.put("message", "Student data listing Successfully");
		
		return _commonResponse(studentObject);
	}
	
	@Override
	public Student addStudent(Student studentModel) throws Exception {
		
	String Name = studentModel.getName();
	String Standard = studentModel.getStandard();
	Student studentEntity = studentLocalServiceUtil.getInstance();
	JSONObject studentObject = JSONFactoryUtil.createJSONObject();
	JSONObject dataObject = JSONFactoryUtil.createJSONObject();
	
	studentEntity.setName(Name);
	studentEntity.setStandard(Standard);
	studentEntity = studentLocalServiceUtil.addstudent(studentEntity);
	
	dataObject.put("id", studentEntity.getId());
	dataObject.put("name", studentEntity.getName());
	dataObject.put("standard", studentEntity.getStandard());
	
	studentObject.put("data", dataObject);
	studentObject.put("message", "Student added Successfully");
	
		return _commonResponse(studentObject);
	}
	@Override
	public Student updateStudent(Student studentModel) throws Exception{
		long id = studentModel.getId();
		String Name = studentModel.getName();
		String Standard = studentModel.getStandard();
		String message = "No Message";
		JSONObject dataObject = JSONFactoryUtil.createJSONObject();
		JSONObject studentObject = JSONFactoryUtil.createJSONObject();
		
		try {
			Student studentEntity = studentLocalServiceUtil.fetchstudent(id);
			
			studentEntity.setName(Name);
			studentEntity.setStandard(Standard);
			studentEntity.studentLocalServiceUtil.updateStudent(studentEntity);
			
			dataObject.put("id", studentEntity.getId());
			dataObject.put("name", studentEntity.getName());
			dataObject.put("standard",studentEntity.getStandard());
			message = "Student updated successfully";
			
		} catch (Exception exception)  {
			message = "Student update failed";
		}
		
		studentObject.put("data", dataObject);
		studentObject.put("message", message);
		
		return _commonResponse(studentObject);
	}
	@Override
	public Student deleteStudent(@Valid @RequestBody Long id) throws Exception {
		String message = "No Message";
		JSONObject dataObject = JSONFactoryUtil.createJSONObject();
		JSONObject studentObject = JSONFactoryUtil.createJSONObject();
		try {
			Student studentEntity = studentLocalServiceUtil.fetchstudent(id);
			studentEntity = studentLocalServiceUtil.deleteStudent(studentEntity.getId());
			 
			message = "Student deleted Successfully";
		} catch (Exception exception) {
			message = "Student deleted failed";
		}
		
		studentObject.put("data", dataObject);
		studentObject.put("message", message);
		return _commonResponse(studentObject);
	}
	
	protected Student _commonResponse(JSONObject studentObject) throws Exception {
		
		return new Student() {{
			data = studentObject.get("data");
			message = studentObject.get("message");
		}};
	
	}
	
}