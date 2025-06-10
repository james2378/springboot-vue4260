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


import com.dao.DiscussdongmanxinxiDao;
import com.entity.DiscussdongmanxinxiEntity;
import com.service.DiscussdongmanxinxiService;
import com.entity.vo.DiscussdongmanxinxiVO;
import com.entity.view.DiscussdongmanxinxiView;

@Service("discussdongmanxinxiService")
public class DiscussdongmanxinxiServiceImpl extends ServiceImpl<DiscussdongmanxinxiDao, DiscussdongmanxinxiEntity> implements DiscussdongmanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdongmanxinxiEntity> page = this.selectPage(
                new Query<DiscussdongmanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussdongmanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdongmanxinxiEntity> wrapper) {
		  Page<DiscussdongmanxinxiView> page =new Query<DiscussdongmanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdongmanxinxiVO> selectListVO(Wrapper<DiscussdongmanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdongmanxinxiVO selectVO(Wrapper<DiscussdongmanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdongmanxinxiView> selectListView(Wrapper<DiscussdongmanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdongmanxinxiView selectView(Wrapper<DiscussdongmanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
