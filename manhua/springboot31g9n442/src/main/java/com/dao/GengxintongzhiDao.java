package com.dao;

import com.entity.GengxintongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GengxintongzhiVO;
import com.entity.view.GengxintongzhiView;


/**
 * 更新通知
 * 
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
public interface GengxintongzhiDao extends BaseMapper<GengxintongzhiEntity> {
	
	List<GengxintongzhiVO> selectListVO(@Param("ew") Wrapper<GengxintongzhiEntity> wrapper);
	
	GengxintongzhiVO selectVO(@Param("ew") Wrapper<GengxintongzhiEntity> wrapper);
	
	List<GengxintongzhiView> selectListView(@Param("ew") Wrapper<GengxintongzhiEntity> wrapper);

	List<GengxintongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<GengxintongzhiEntity> wrapper);
	
	GengxintongzhiView selectView(@Param("ew") Wrapper<GengxintongzhiEntity> wrapper);
	

}
