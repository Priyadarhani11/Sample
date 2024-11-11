package com.headless.student.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author Dell
 * @generated
 */
@Component(
	property = {
		"liferay.jackson=false",
		"osgi.jaxrs.application.base=/student-headless-delivery",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=StudentHeadlessDelivery"
	},
	service = Application.class
)
@Generated("")
public class StudentHeadlessDeliveryApplication extends Application {
}