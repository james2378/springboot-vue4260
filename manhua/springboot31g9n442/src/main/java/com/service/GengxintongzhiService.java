package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GengxintongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GengxintongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GengxintongzhiView;


/**
 * 更新通知
 *
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
public interface GengxintongzhiService extends IService<GengxintongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GengxintongzhiVO> selectListVO(Wrapper<GengxintongzhiEntity> wrapper);
   	
   	GengxintongzhiVO selectVO(@Param("ew") Wrapper<GengxintongzhiEntity> wrapper);
   	
   	List<GengxintongzhiView> selectListView(Wrapper<GengxintongzhiEntity> wrapper);
   	
   	GengxintongzhiView selectView(@Param("ew") Wrapper<GengxintongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GengxintongzhiEntity> wrapper);
   	

}

