/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 package org.springframework.samples.petclinic.system;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@ConditionalOnProperty("petclinic.s1.message")
@Profile({"demo", "cloud"})
@Component
public class PropertyBasedWelcomeMessageProvider implements WelcomeMessageProvider {

	private final WelcomeMessageProperties properties;

	public PropertyBasedWelcomeMessageProvider(WelcomeMessageProperties properties) {
		this.properties = properties;
	}

	@Override
	public String get() {
		return this.properties.getMessage();
	}

}
