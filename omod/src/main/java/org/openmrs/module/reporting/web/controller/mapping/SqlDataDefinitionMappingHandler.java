/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.reporting.web.controller.mapping;

import org.openmrs.annotation.Handler;
import org.openmrs.module.reporting.data.BaseSqlDataDefinition;
import org.openmrs.module.reporting.evaluation.Definition;
import org.openmrs.module.reporting.query.BaseSqlQuery;

/**
 * Handler that determines what pages are redirected for creating and editing BaseSqlDataDefinition
 */
@Handler(supports=BaseSqlDataDefinition.class, order=50)
public class SqlDataDefinitionMappingHandler extends DefinitionMappingHandler {

	/**
	 * @see DefinitionMappingHandler#getCreateUrl(Class)
	 */
	public String getCreateUrl(Class<? extends Definition> type) {
		return "/module/reporting/definition/sqlDefinition.form?type="+type.getName();
	}
}

