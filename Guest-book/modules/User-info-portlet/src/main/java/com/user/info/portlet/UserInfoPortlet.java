package com.user.info.portlet;

import com.user.info.constants.UserInfoPortletKeys;
import com.user.service.ExcelLocalServiceUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.osgi.service.component.annotations.Component;

/**
 * @author Dell
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=UserInfo",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UserInfoPortletKeys.USERINFO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UserInfoPortlet extends MVCPortlet {
	public void uploadFile(ActionRequest request, ActionResponse response) throws IOException {

        UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
        File file = uploadRequest.getFile("excelFile");
        
        List<String> duplicateEntries = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(file); 
        		Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }

                Cell nameCell = row.getCell(0);
                Cell addressCell = row.getCell(1);
                Cell phoneNumberCell = row.getCell(2);

                if (nameCell == null || addressCell == null || phoneNumberCell == null) {
                    continue;
                }

                String name = nameCell.getStringCellValue();
                String address = addressCell.getStringCellValue();
                long phoneNumber = (long) phoneNumberCell.getNumericCellValue();
                
                if (ExcelLocalServiceUtil.isPhoneNumberExists(phoneNumber)) {
                    duplicateEntries.add("Duplicate entry found: " + name + ", " + address + ", " + phoneNumber);
                    continue;
                }

                ExcelLocalServiceUtil.addMyEntity(name, address, phoneNumber);
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }
        request.setAttribute("duplicateEntries", duplicateEntries);
    }
	
}