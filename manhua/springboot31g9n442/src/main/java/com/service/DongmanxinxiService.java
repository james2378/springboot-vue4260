package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongmanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongmanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongmanxinxiView;


/**
 * 漫画信息
 *
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
public interface DongmanxinxiService extends IService<DongmanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongmanxinxiVO> selectListVO(Wrapper<DongmanxinxiEntity> wrapper);
   	
   	DongmanxinxiVO selectVO(@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);
   	
   	List<DongmanxinxiView> selectListView(Wrapper<DongmanxinxiEntity> wrapper);
   	
   	DongmanxinxiView selectView(@Param("ew") Wrapper<DongmanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongmanxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DongmanxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DongmanxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DongmanxinxiEntity> wrapper);



}

