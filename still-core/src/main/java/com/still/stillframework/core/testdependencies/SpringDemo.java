package com.still.stillframework.core.testdependencies;

import org.springframework.stereotype.Component;
/**
 * @author Still1
 *
 * SpringDemo for dependency injection
 */
@Component
class SpringDemo {
	/**
	 * It is a simple output to test if Spring works.
	 */
	Integer output() {
		return 1;
	}
}
