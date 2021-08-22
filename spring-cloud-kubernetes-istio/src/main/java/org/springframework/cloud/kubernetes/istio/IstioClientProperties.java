/*
 * Copyright 2013-2019 the original author or authors.
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

package org.springframework.cloud.kubernetes.istio;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Istio client properties.
 *
 * @author Mauricio Salatino
 */
@Configuration
@ConfigurationProperties("spring.cloud.istio.client")
public class IstioClientProperties {

	private Integer envoyPort = 15090;

	private String testPath = "stats/prometheus";

	public Integer getEnvoyPort() {
		return this.envoyPort;
	}

	public void setEnvoyPort(Integer envoyPort) {
		this.envoyPort = envoyPort;
	}

	public String getTestPath() {
		return this.testPath;
	}

	public void setTestPath(String testPath) {
		this.testPath = testPath;
	}

}
