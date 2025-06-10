package com.dao;

import com.entity.DongmanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DongmanxinxiVO;
import com.entity.view.DongmanxinxiView;


/**
 * 漫画信息
 * 
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
public interface DongmanxinxiDao extends BaseMapper<DongmanxinxiEntity> {
	
	List<DongmanxinxiVO> selectListVO(@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);
	
	DongmanxinxiVO selectVO(@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);
	
	List<DongmanxinxiView> selectListView(@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);

	List<DongmanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);
	
	DongmanxinxiView selectView(@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);



}
