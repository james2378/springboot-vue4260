package com.dao;

import com.entity.DingyuexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingyuexinxiVO;
import com.entity.view.DingyuexinxiView;


/**
 * 订阅信息
 * 
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
public interface DingyuexinxiDao extends BaseMapper<DingyuexinxiEntity> {
	
	List<DingyuexinxiVO> selectListVO(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
	
	DingyuexinxiVO selectVO(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
	
	List<DingyuexinxiView> selectListView(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);

	List<DingyuexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
	
	DingyuexinxiView selectView(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);



}
