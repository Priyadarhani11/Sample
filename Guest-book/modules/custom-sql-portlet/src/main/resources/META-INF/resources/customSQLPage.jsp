<%@page import="com.demo.org.model.Department"%>
<%@page import="com.demo.org.model.Employee"%>
<%@page import="com.demo.org.model.Bank"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/2.0.8/css/dataTables.dataTables.min.css">
<script src="https://cdn.datatables.net/2.0.8/js/dataTables.min.js"></script>

<h1>Custom SQL Page....</h1>

<script>
	new DataTable('#myTable');
</script>

<%
List<Bank> bankList = (List) request.getAttribute("bankList");
List<Employee> employeeList = (List) request.getAttribute("employeeList");
List<Department> departmentList = (List) request.getAttribute("departmentList");

if(bankList != null){
	System.out.println("Bank List...11111111"+ bankList);
}else {
	System.out.println("Bank List is null");
}

if(employeeList != null){
	System.out.println("employeeList...11111111"+ employeeList);
}else {
	System.out.println("employeeList List is null");
}

if(departmentList != null){
	System.out.println("departmentList...11111111"+ departmentList);
}else {
	System.out.println("departmentList List is null");
}

%>

<table id="myTable" class="display">
    <thead>
        <tr>
             <th>Bank Id</th>
            <th>Bank Name</th>
            <th>Bank Address</th>
            <th>Employee Name</th>
            <th>Employee Address</th>
            <th>Employee PhoneNumber</th>
             <th>Department No</th>
             <th>Department Name</th>
        </tr>
    </thead>
    <tbody>
     <% 
    for (Bank bank : bankList) { 
        for (Employee employee : employeeList) { 
             if (employee.getBankId() == bank.getBankId()) {
            for (Department department : departmentList) { 
                if (department.getEmployeeId() == employee.getEmployeeId()) {
            
    %>
        <tr>
             <td><%= bank.getBankId() %></td>
            <td><%= bank.getBankName() %></td>
            <td><%= bank.getBankAddress() %></td>
            <td><%= employee.getEmployeeName() %></td>
            <td><%= employee.getEmployeeAddress() %></td>
            <td><%= employee.getEmployeePhoneNo() %></td>
            <td><%= department.getDepartmentNo() %></td>
            <td><%= department.getDepartmentName() %></td>
        </tr>
    <% }}}}} %> 
    </tbody>
</table>

