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

package org.joinfaces.autoconfigure.weld;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The goal of this class is to initialize weld in order to have a full cdi environment
 *
 * @author classicPintus
 * @see org.joinfaces.autoconfigure.weld.WeldServletContextInitializer for more details
 */

@Configuration
@ConditionalOnWebApplication
@ConditionalOnClass(name = "org.jboss.weld.environment.servlet.EnhancedListener")
public class WeldSpringBootAutoConfiguration {

    @Bean
    public WeldServletContextInitializer weldServletContextInitializer(){
        return new WeldServletContextInitializer();
    }
    
}
