package com.students.rest.application;

import com.liferay.portal.kernel.service.CompanyService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;

import java.util.Collections;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import Web.Services.builder.model.Student;
import Web.Services.builder.service.StudentService;

/**
 * @author Priya
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/greetings",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Greetings.Rest"
	},
	service = Application.class
)
public class StudentsRestApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@Reference
	private StudentService studentService;

	@Reference
	private CompanyService companyService;

	@GET
	@Path("get/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudent(@PathParam("studentId") long studentId) {
	    try {
	    
	       Student student = studentService.getStudent(studentId);

	      
	        if (student == null) {
	            return Response.status(Response.Status.NOT_FOUND).entity("Student not found").build();
	        }

	        return Response.ok(student).build();
	    } catch (Exception e) {
	        return Response.serverError().entity("Error retrieving student: " + e.getMessage()).build();
	    }
	}


	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addStudent(StudentDTO studentDTO, @Context HttpServletRequest request) {
		try {

			long userId = Long.parseLong(request.getUserPrincipal().getName());

			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setRequest(request);
			serviceContext.setCompanyId(PortalUtil.getDefaultCompanyId());
			serviceContext.setUserId(userId);

			Student student = studentService.addStudent(studentDTO.getGroupId(), studentDTO.getStudentName(),
					studentDTO.getEmail(), studentDTO.getMobileNumber(), serviceContext);
			return Response.ok(student).build();
		} catch (Exception e) {
			return Response.serverError().entity("Error adding employee: " + e.getMessage()).build();
		}
	}

	@PUT
	@Path("/update/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateStudent(@PathParam("studentId") long studentId, StudentDTO studentDTO) {
		try {

			Student updatedStudent = studentService.updateStudent(studentId, studentDTO.getStudentName(),
					studentDTO.getEmail(), studentDTO.getMobileNumber());

			return Response.ok(updatedStudent).build();
		} catch (Exception e) {
			return Response.serverError().entity("Error updating student: " + e.getMessage()).build();
		}
	}

	@DELETE
	@Path("/delete/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteStudent(@PathParam("studentId") long studentId, @Context HttpServletRequest request) {
		try {
			System.out.println(studentId);
			studentService.deleteStudent(studentId);

			return Response.ok().entity("Student deleted successfully").build();
		} catch (Exception e) {
			return Response.serverError().entity("Error deleting student: " + e.getMessage()).build();
		}
	}
	
	
	

}