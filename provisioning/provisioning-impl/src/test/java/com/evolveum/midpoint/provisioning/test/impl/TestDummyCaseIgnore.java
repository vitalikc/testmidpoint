/*
 * Copyright (c) 2010-2013 Evolveum
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.evolveum.midpoint.provisioning.test.impl;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import com.evolveum.midpoint.provisioning.ucf.impl.ConnectorFactoryIcfImpl;
import com.evolveum.midpoint.schema.GetOperationOptions;
import com.evolveum.midpoint.test.util.TestUtil;

/**
 * Almost the same as TestDummy but this is using a caseIgnore resource version.
 * 
 * @author Radovan Semancik
 *
 */
@ContextConfiguration(locations = "classpath:ctx-provisioning-test-main.xml")
@DirtiesContext
public class TestDummyCaseIgnore extends TestDummy {
	
	public static final String TEST_DIR = "src/test/resources/impl/dummy-case-ignore/";
	public static final String RESOURCE_DUMMY_FILENAME = TEST_DIR + "resource-dummy.xml";

	@Override
	protected String getResourceDummyFilename() {
		return RESOURCE_DUMMY_FILENAME;
	}
	
	@Override
	protected String getWillRepoIcfUid() {
		return "will";
	}
	
	@Test
	public void test175SearchUidCase() throws Exception {
		final String TEST_NAME = "test175SearchUidCase";
		TestUtil.displayTestTile(TEST_NAME);
		testSeachIterativeSingleAttrFilter(TEST_NAME, 
				ConnectorFactoryIcfImpl.ICFS_UID, "wIlL", null, true,
				"Will");
	}
	
	@Test
	public void test176SearchUidCaseNoFetch() throws Exception {
		final String TEST_NAME = "test176SearchUidCaseNoFetch";
		TestUtil.displayTestTile(TEST_NAME);
		testSeachIterativeSingleAttrFilter(TEST_NAME, 
				ConnectorFactoryIcfImpl.ICFS_UID, "wIlL", GetOperationOptions.createNoFetch(), false,
				"Will");
	}
	
	
}
