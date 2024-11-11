/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Professor service. Represents a row in the &quot;professors&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ProfessorModel
 * @generated
 */
@ImplementationClassName("com.dualdb.model.impl.ProfessorImpl")
@ProviderType
public interface Professor extends PersistedModel, ProfessorModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.dualdb.model.impl.ProfessorImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Professor, Integer> P_ID_ACCESSOR =
		new Accessor<Professor, Integer>() {

			@Override
			public Integer get(Professor professor) {
				return professor.getPId();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<Professor> getTypeClass() {
				return Professor.class;
			}

		};

}