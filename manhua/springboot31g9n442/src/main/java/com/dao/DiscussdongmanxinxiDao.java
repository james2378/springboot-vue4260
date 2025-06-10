package com.dao;

import com.entity.DiscussdongmanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdongmanxinxiVO;
import com.entity.view.DiscussdongmanxinxiView;


/**
 * 漫画信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-12-05 20:50:10
 */
public interface DiscussdongmanxinxiDao extends BaseMapper<DiscussdongmanxinxiEntity> {
	
	List<DiscussdongmanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussdongmanxinxiEntity> wrapper);
	
	DiscussdongmanxinxiVO selectVO(@Param("ew") Wrapper<DiscussdongmanxinxiEntity> wrapper);
	
	List<DiscussdongmanxinxiView> selectListView(@Param("ew") Wrapper<DiscussdongmanxinxiEntity> wrapper);

	List<DiscussdongmanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdongmanxinxiEntity> wrapper);
	
	DiscussdongmanxinxiView selectView(@Param("ew") Wrapper<DiscussdongmanxinxiEntity> wrapper);
	

}
