package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingyuexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingyuexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingyuexinxiView;


/**
 * 订阅信息
 *
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
public interface DingyuexinxiService extends IService<DingyuexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingyuexinxiVO> selectListVO(Wrapper<DingyuexinxiEntity> wrapper);
   	
   	DingyuexinxiVO selectVO(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
   	
   	List<DingyuexinxiView> selectListView(Wrapper<DingyuexinxiEntity> wrapper);
   	
   	DingyuexinxiView selectView(@Param("ew") Wrapper<DingyuexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingyuexinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DingyuexinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DingyuexinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DingyuexinxiEntity> wrapper);



}

