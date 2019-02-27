package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;


public interface ContentCategoryService {
	//通过节点的id查询该节点的子节点列表
	public List<EasyUITreeNode> getContentCategoryList(Long parentId);
	//添加内容分类
	/**
	 * 父节点的id
	 * 新增节点的名称
	 * @param parentId
	 * @param name
	 * @return
	 */
	public TaotaoResult createContentCategory(Long parentId,String name);
}
