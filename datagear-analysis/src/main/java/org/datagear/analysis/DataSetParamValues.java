/*
 * Copyright (c) 2018 datagear.tech. All Rights Reserved.
 */

/**
 * 
 */

package org.datagear.analysis;

import java.util.Map;

/**
 * 数据集参数值集合。
 * <p>
 * 此类表示{@linkplain DataSetFactory}创建{@linkplain DataSet}所需要的参数值集。
 * </p>
 * 
 * @author datagear@163.com
 *
 */
public class DataSetParamValues extends AbstractDelegatedMap<String, Object>
{
	public DataSetParamValues()
	{
		super();
	}

	@SuppressWarnings("unchecked")
	public DataSetParamValues(Map<String, ?> dataSetParamValues)
	{
		super((Map<String, Object>) dataSetParamValues);
	}
}