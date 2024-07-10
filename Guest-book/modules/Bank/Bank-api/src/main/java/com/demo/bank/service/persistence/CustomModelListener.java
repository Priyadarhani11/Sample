/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.demo.bank.service.persistence;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = ModelListener.class)
public class CustomModelListener extends BaseModelListener<User> {
	private static final Log _log = LogFactoryUtil.getLog(ModelListener.class);

	@Override
	public void onAfterRemove(User model) throws ModelListenerException {
		_log.info("User is deleted Successfully");
		_log.info("userModel : " + model);
		super.onAfterRemove(model);
	}

	@Override
	public void onBeforeRemove(User model) throws ModelListenerException {
		_log.info("User is to deleted");
		_log.info("userModel : " + model);
		super.onBeforeRemove(model);
	}

	@Override
	public void onAfterCreate(User model) throws ModelListenerException {
		_log.info("in onAfterCreate method");
		_log.info("userModel : " + model);
		super.onAfterCreate(model);
	}

	@Override
	public void onBeforeCreate(User model) throws ModelListenerException {
		_log.info("in onBeforeCreate method");
		_log.info("userModel : " + model);
		super.onBeforeCreate(model);
	}

	@Override
	public void onBeforeUpdate(User originalModel, User model) throws ModelListenerException {
		_log.info("in onBeforeUpdate method");
		_log.info("userModel : " + model);
		super.onBeforeUpdate(originalModel, model);
	}

	@Override
	public void onAfterUpdate(User originalModel, User model) throws ModelListenerException {
		_log.info("in onAfterUpdate method");
		_log.info("userModel : " + model);
		super.onAfterUpdate(originalModel, model);
	}

	@Override
	public void onBeforeAddAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		_log.info("Before updating association for User: " + classPK);
		super.onBeforeAddAssociation(classPK, associationClassName, associationClassPK);
	}

	@Override
	public void onAfterAddAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		_log.info("After updating association for User: " + classPK);
		super.onAfterAddAssociation(classPK, associationClassName, associationClassPK);
	}

	@Override
	public void onBeforeRemoveAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		_log.info("Before removing association for User: " + classPK);
		super.onBeforeRemoveAssociation(classPK, associationClassName, associationClassPK);
	}

	@Override
	public void onAfterRemoveAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		_log.info("After removing association for User: " + classPK);
		super.onAfterRemoveAssociation(classPK, associationClassName, associationClassPK);
	}
}
