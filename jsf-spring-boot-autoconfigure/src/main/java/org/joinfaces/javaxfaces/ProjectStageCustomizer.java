/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.joinfaces.javaxfaces;

import javax.faces.application.ProjectStage;

import lombok.RequiredArgsConstructor;
import org.joinfaces.configuration.ServletContextInitParameterConfigurationPropertiesCustomizer;

/**
 * {@link ServletContextInitParameterConfigurationPropertiesCustomizer} for setting the JSF
 * {@link JavaxFaces2_0Properties#projectStage project stage}.
 *
 * @author Lars Grefer
 */
@RequiredArgsConstructor
public class ProjectStageCustomizer implements ServletContextInitParameterConfigurationPropertiesCustomizer<JavaxFaces2_0Properties> {

	final ProjectStage projectStage;

	@Override
	public void process(JavaxFaces2_0Properties properties) {
		if (properties.getProjectStage() == null) {
			properties.setProjectStage(this.projectStage);
		}
	}
}
