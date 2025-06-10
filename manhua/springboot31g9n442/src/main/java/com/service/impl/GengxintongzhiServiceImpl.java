package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GengxintongzhiDao;
import com.entity.GengxintongzhiEntity;
import com.service.GengxintongzhiService;
import com.entity.vo.GengxintongzhiVO;
import com.entity.view.GengxintongzhiView;

@Service("gengxintongzhiService")
public class GengxintongzhiServiceImpl extends ServiceImpl<GengxintongzhiDao, GengxintongzhiEntity> implements GengxintongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GengxintongzhiEntity> page = this.selectPage(
                new Query<GengxintongzhiEntity>(params).getPage(),
                new EntityWrapper<GengxintongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GengxintongzhiEntity> wrapper) {
		  Page<GengxintongzhiView> page =new Query<GengxintongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GengxintongzhiVO> selectListVO(Wrapper<GengxintongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GengxintongzhiVO selectVO(Wrapper<GengxintongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GengxintongzhiView> selectListView(Wrapper<GengxintongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GengxintongzhiView selectView(Wrapper<GengxintongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
