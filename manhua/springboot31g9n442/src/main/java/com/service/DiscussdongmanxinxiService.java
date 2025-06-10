package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdongmanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdongmanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdongmanxinxiView;


/**
 * 漫画信息评论表
 *
 * @author 
 * @email 
 * @date 2023-12-05 20:50:10
 */
public interface DiscussdongmanxinxiService extends IService<DiscussdongmanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdongmanxinxiVO> selectListVO(Wrapper<DiscussdongmanxinxiEntity> wrapper);
   	
   	DiscussdongmanxinxiVO selectVO(@Param("ew") Wrapper<DiscussdongmanxinxiEntity> wrapper);
   	
   	List<DiscussdongmanxinxiView> selectListView(Wrapper<DiscussdongmanxinxiEntity> wrapper);
   	
   	DiscussdongmanxinxiView selectView(@Param("ew") Wrapper<DiscussdongmanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdongmanxinxiEntity> wrapper);
   	

}

