package org.blade.test.biz;

import java.util.Date;

import javax.annotation.Resource;

import org.blade.admin.entity.biz.Goods;
import org.blade.admin.service.biz.GoodsService;
import org.blade.utils.CodeUtils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	@Resource
	private GoodsService goodsService;
	
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		Goods goods = new Goods();
		goods.setCount(0);
		goods.setId(CodeUtils.generateUUID());
		goods.setUuid(CodeUtils.generateUUID());
		goods.setModifyTime(new Date());
		goods.setCreateTime(new Date());
		goods.setName("长T");
		goods.setPrice(10.8D);
		goods.setMerchant(CodeUtils.generateUUID());
		int i = goodsService.save(goods);
		assert i > 0;
	}
}
